package xyz.hidasy.rest;

import java.sql.*;

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
            " NAME           TEXT     NOT NULL," +
            " CPF            CHAR(14) NOT NULL," +
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

    public static boolean insertPatient(Patient patient) {
        String sql = "INSERT INTO PATIENT(ID, NAME, CPF, BIRTHDATE, GENDER, PHONE, HEALTHPLAN) VALUES (" +
                patient.getId() + ",'" + patient.getName() + "','" + patient.getCpf() + "'," +
                patient.getBirthDate() + ",'" + patient.getGender() + "','" + patient.getPhone() + "','" +
                patient.getHealthPlan() + "');";

        System.out.println("Query for insertion: " + sql);

        try {
            Statement statement = c.createStatement();
            statement.executeUpdate(sql);

            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }
    }


}
