package xyz.hidasy.rest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

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
