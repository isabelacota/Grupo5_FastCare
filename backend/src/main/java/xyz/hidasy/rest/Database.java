package xyz.hidasy.rest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import static xyz.hidasy.rest.JsonUtils.*;

public class Database {
    private static Connection c = null;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:dbs/main.db");
            c.setAutoCommit(true);
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        try {
            String sql = "CREATE TABLE PATIENT  "    +
		"(ID BIGINT PRIMARY KEY      NOT NULL," +
		" NAME           TEXT     NOT NULL UNIQUE," +
		" CPF            CHAR(14) NOT NULL UNIQUE," +
		" BIRTHDATE      INT      ," +
		" CREATED        INT      ," +
		" GENDER         TEXT     NOT NULL," +
		" PHONE          TEXT     ," +
		" HEALTHPLAN     TEXT     ," +
		" ADDRESS        CHAR(50))";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE SUBJECTIVE         " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" MAINCOMPLAINT   TEXT     NOT NULL,          " +
		" STORY           TEXT NOT NULL,              " +
		" PATIENTDATA     TEXT,                       " +
		" LASTUPDATE      INT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE OBJECTIVE         " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" PATIENTDATA     TEXT,                       " +
		" LASTUPDATE      INT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE DIAGNOSIS         " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" DATA       TEXT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE PLAN         " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" DATA         TEXT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE EVOLUTION         " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" DATA       TEXT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }
	try {
            String sql = "CREATE TABLE APPOINTMENT      " +
		"(ID              BIGINT PRIMARY KEY NOT NULL," +
		" PATIENTID       BIGINT," +
		" RUNNING         INT," +
		" CREATEDAT         TEXT)";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
	} catch(Exception ee) {
            ee.printStackTrace();
        }

	try {
	    String sql;
	    Statement stmt = c.createStatement();

	    sql = "CREATE TABLE AUDIT " +
		"(ID    INTEGER PRIMARY KEY," +
		"USER   TEXT    NOT NULL," +
		"DATE   TEXT    NOT NULL," +
		"ACTION TEXT    NOT NULL);";
	    System.out.println(sql);
	    stmt.executeUpdate(sql);

	    sql = "INSERT INTO PATIENT(ID,NAME,CPF,BIRTHDATE,CREATED,GENDER,ADDRESS)" +
		"VALUES (1, 'Maria', '123.234.345-45', 23, 21313, 'Female', 'rua banha 3')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT(ID,NAME,CPF,BIRTHDATE,CREATED,GENDER, ADDRESS)" +
		"VALUES (2, 'João', '223.234.345-45', 33, 11313, 'Male', 'rua  banha 4')";
            stmt.executeUpdate(sql);

        } catch(Exception ee) {
            ee.printStackTrace();
        }

    }

    public static void addAppointment(Appointment a) throws SQLException {
	String sql = "INSERT INTO APPOINTMENT(ID,PATIENTID,RUNNING,CREATEDAT) VALUES (" +
	    A.getAppointmentId() + "','" + a.getPatientId() +
	    "'," + a.getRunning() + ",'" + a.getCreatedAt +";";
        System.out.println("Query for insertion: " + sql);
	insertAudit("Medico","Inserted appointment");
	Statement statement = c.createStatement();
	statement.executeUpdate(sql);
    }

    public static Appointment getAppointmentById(Long id) {
	Appointment appointment = null;
	try {
	    String sql = "SELECT * FROM APPOINTMENT WHERE ID = " + id;
	    Statement stmt = c.createStatement();

	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	    appointment.setAppointmentId(rs.getString("id"));
	    appointment.setPatientId(rs.getString("patientid"));
	    appointment.setRunning(rs.getString("running"));
	    appointment.setCreatedAt(rs.getString("createdat"));
	    //...
	    rs.close();
	} catch(Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		//c.commit();
		//c.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return appointment;
    }
    public static Appointment getRunningAppointmentByPatientId(Long id) {
	try {
	    String sql = "SELECT * FROM APPOINTMENT WHERE PATIENTID = " + id + " AND RUNNING = 1";
	    Statement stmt = c.createStatement();

	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	    Appointment appointment = new Appointment;
	    appointment.setAppointmentId(rs.getString("id"));
	    appointment.setPatientId(rs.getString("patientid"));
	    appointment.setRunning(rs.getString("running"));
	    appointment.setCreatedAt(rs.getString("createdat"));
	    Appointments.append(appointment);
	    //...
	    rs.close();
	} catch(Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		//c.commit();
		//c.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return appointment;
    }
    
    
    public static Subjective getSubjectiveById(Long id) {
	Subjective subjective = null;
	try {
	    String sql = "SELECT * FROM SUBJECTIVE WHERE ID = " + id;
	    Statement stmt = c.createStatement();

	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	    subjective = readFromJson(rs.getString("patientdata"),Subjective.class);
	    subjective.setMainComplaint(rs.getString("maincomplaint"));
	    subjective.setStory(rs.getString("story"));
	    subjective.setLastUpdatedAt(rs.getString("lastupdate"));
	    //...
	    rs.close();
	} catch(Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		//c.commit();
		//c.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return subjective;
     }

    public static void addSubjective(Subjective s) throws SQLException {
	String sql = "INSERT INTO SUBJECTIVE(MAINCOMPLAINT,STORY,PATIENTDATA,LASTUPDATE) VALUES (" +
	    s.getMainComplaint() + "','" + s.getStory() +
	    "'," + writeToJson(s) + ",'" + s.getLastUpdatedAt() +";";
        System.out.println("Query for insertion: " + sql);
	insertAudit("Medico","Inserted subjective appointment");
	Statement statement = c.createStatement();
	statement.executeUpdate(sql);
    }

    public static Objective getObjectiveById(Long id) {
	Objective objective = null;
	try {
	    String sql = "SELECT * FROM OBJECTIVE WHERE ID = " + id;
	    Statement stmt = c.createStatement();

	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	    objective = readFromJson(rs.getString("patientdata"),Objective.class);
	    objective.setLastUpdatedAt(rs.getString("lastupdate"));
	    //...
	    rs.close();
	} catch(Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		//c.commit();
		//c.close();
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	return objective;
    }
    public static void addObjective(Objective o) throws SQLException {
	String sql = "INSERT INTO OBJECTIVE(ID,PATIENTDATA,LASTUPDATE) VALUES (" +
	    writeToJson(o) + ",'" + o.getLastUpdatedAt() +";";
        System.out.println("Query for insertion: " + sql);
	insertAudit("Medico","Inserted subjective appointment");
	Statement statement = c.createStatement();
	statement.executeUpdate(sql);
    }


    public static Diagnosis getDiagnosisById(Long id) {
    	Diagnosis d = null;
    	try {
    	    String sql = "SELECT * FROM DIAGNOSIS WHERE ID = " + id;
    	    Statement stmt = c.createStatement();

    	    ResultSet rs = stmt.executeQuery(sql);
    	    rs.next();
    	    d = readFromJson(rs.getString("DATA"),Diagnosis.class);
    	    //...
    	    rs.close();
	} catch(Exception e) {
    	    e.printStackTrace();
    	}
    	return d;
    }

    public static void addDiagnosis(Diagnosis d) throws SQLException {
    	String sql = "INSERT INTO DIAGNOSIS(PATIENTDATA) VALUES (" +
	    writeToJson(d) +";";
        System.out.println("Query for insertion: " + sql);
    	insertAudit("Medico","Inserted diagnosis appointment");
    	Statement statement = c.createStatement();
    	statement.executeUpdate(sql);
    }
    public static Plan getPlanById(Long id) {
    	Plan p = null;
    	try {
    	    String sql = "SELECT * FROM DIAGNOSIS WHERE ID = " + id;
    	    Statement stmt = c.createStatement();

    	    ResultSet rs = stmt.executeQuery(sql);
    	    rs.next();
    	    d = readFromJson(rs.getString("DATA"),Plan.class);
    	    //...
    	    rs.close();
	} catch(Exception e) {
    	    e.printStackTrace();
    	}
    	return p;
    }

    public static void addPlan(Plan p) throws SQLException {
    	String sql = "INSERT INTO PLAN(PATIENTDATA) VALUES (" +
	    writeToJson(p) +";";
        System.out.println("Query for insertion: " + sql);
    	insertAudit("Medico","Inserted plan appointment");
    	Statement statement = c.createStatement();
    	statement.executeUpdate(sql);
    }

    public static Evolution getEvolutionById(Long id) {
    	Evolution e = null;
    	try {
    	    String sql = "SELECT * FROM EVOLUTION WHERE ID = " + id;
    	    Statement stmt = c.createStatement();

    	    ResultSet rs = stmt.executeQuery(sql);
    	    rs.next();
    	    e = readFromJson(rs.getString("DATA"),Evolution.class);
    	    //...
    	    rs.close();
	} catch(Exception e) {
    	    e.printStackTrace();
    	}
    	return e;
    }

    public static void addEvolution(Evolution e) throws SQLException {
    	String sql = "INSERT INTO EVOLUTION(PATIENTDATA) VALUES (" +
	    writeToJson(e) +";";
        System.out.println("Query for insertion: " + sql);
    	insertAudit("Medico","Inserted evolution appointment");
    	Statement statement = c.createStatement();
    	statement.executeUpdate(sql);
    }

    public static Patient getPatientById(Long id) {
        Patient patient = new Patient();
        try {
            String sql = "SELECT * FROM PATIENT WHERE ID = " + id;
            Statement stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            patient.setId(rs.getLong("id"));
            patient.setName(rs.getString("name"));
            patient.setCpf(rs.getString("cpf"));
            patient.setGender(rs.getString("gender"));
            patient.setBirthDate(rs.getLong("birthdate"));
            patient.setPhone(rs.getString("phone"));
            patient.setHealthPlan(rs.getString("healthplan"));
            //...
            rs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //c.commit();
                //c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	return patient;
    }

    public static void insertAudit(String User, String Action) {
	try {
	    Statement stmt = c.createStatement();
	    String sql;
	    sql = "INSERT INTO AUDIT(USER, DATE, ACTION) " +
		"VALUES ('"+User+"','"+new Date().toString()+"','"+Action+"')";
            stmt.executeUpdate(sql);
	} catch (Exception e) {
	    System.out.println(e.toString());
	}
    }

    public static List<Audit> getAuditLog() {
        String sql = "SELECT * FROM AUDIT";

        System.out.println("Query for select: " + sql);

        try {
            Statement statement = c.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            List<Audit> Audits = new ArrayList<Audit>();
            while (rs.next()) {
		Audit audit = new Audit();

                audit.setId(rs.getLong("id"));
                audit.setUser(rs.getString("user"));
                audit.setAction(rs.getString("action"));
                audit.setDate(rs.getString("date"));
                Audits.add(audit);
            }

            return Audits;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }

    
    public static void insertPatient(Patient patient) throws SQLException {
        String sql = "INSERT INTO PATIENT(ID, NAME, CPF, BIRTHDATE, GENDER, PHONE, HEALTHPLAN, CREATED) VALUES (" +
	    patient.getId() + ",'" + patient.getName() + "','" + patient.getCpf() + "'," +
	    patient.getBirthDate() + ",'" + patient.getGender() + "','" + patient.getPhone() + "','" +
	    patient.getHealthPlan() + "'," + new Date().getTime() +");";

        System.out.println("Query for insertion: " + sql);

        Statement statement = c.createStatement();
        statement.executeUpdate(sql);
    }

    public static List<Patient> filterPatients(String filter) {
        String sql = "SELECT * FROM PATIENT WHERE (" +
	    "NAME LIKE '%" + filter + "%' OR CPF LIKE '%" + filter + "%' OR PHONE LIKE '%" + filter + "%');";

        System.out.println("Query for select: " + sql);

        try {
            Statement statement = c.createStatement();

            ResultSet rs = statement.executeQuery(sql);
            List<Patient> patients = new ArrayList<Patient>();
            while (rs.next()) {
                Patient patient = new Patient();

                patient.setId(rs.getLong("id"));
                patient.setName(rs.getString("name"));
                patient.setCpf(rs.getString("cpf"));
                patient.setGender(rs.getString("gender"));
                patient.setBirthDate(rs.getLong("birthdate"));
                patient.setPhone(rs.getString("phone"));
                patient.setHealthPlan(rs.getString("healthplan"));
                patient.setCreatedAt(rs.getLong("created"));

                patients.add(patient);
            }

            System.out.println("PAtients: " + patients);
            return patients;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }
}
