package xyz.hidasy.rest;

import java.sql.*;
import xyz.hidasy.rest.Patient;

public class PatientCRUD {
    Connection c = null;
    Statement stmt = null;
    Patient P = new Patient(); 
    String sql;
    PatientCRUD(int id) {
	try {
	    Class.forName("org.sqlite.JDBC");
	    c = DriverManager.getConnection("jdbc:sqlite:dbs/main.db");
	    c.setAutoCommit(false);
	} catch ( Exception e ) {
	    System.out.println(e.toString());
	}
	
	try {
	    sql = "CREATE TABLE PATIENT  "    +
	    "(ID INT PRIMARY KEY      NOT NULL," +
	    " NAME           TEXT     NOT NULL," +
	    " CPF            CHAR(14) NOT NULL," +
	    " AGE            INT      NOT NULL," +
	    " CREATED        INT      NOT NULL," +
	    " GENDER         TEXT     NOT NULL," +
	    " ADDRESS        CHAR(50))";
	    stmt = c.createStatement();
	    stmt.executeUpdate(sql);
	    sql = "INSERT INTO PATIENT(ID,NAME,CPF,AGE,CREATED,GENDER,ADDRESS)" +
		"VALUES (1, 'Maria', '123.234.345-45', 23, 21313, 'Female', 'rua banha 3')";
	    stmt.executeUpdate(sql);
	    sql = "INSERT INTO PATIENT(ID,NAME,CPF,AGE,CREATED,GENDER, ADDRESS)" +
		"VALUES (2, 'João', '223.234.345-45', 33, 11313, 'Male', 'rua  banha 4')";
	    stmt.executeUpdate(sql);
   
	} catch(Exception ee) {
	    System.out.println(ee.toString());
	}
	try {
	    sql = "SELECT * FROM PATIENT WHERE ID = " + id;
	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	    P.setName(rs.getString("name"));
	    P.setCpf(rs.getString("cpf"));
	    P.setGender(rs.getString("gender"));
	    P.setBirth(rs.getLong("age"));
	    //...
	    rs.close();
	} catch(Exception e) {
	    System.out.println(e.toString());
	}
	finally {
	    try {
		c.commit();
		c.close();
	    } catch (Exception e) {
		System.out.println(e.toString());
	    }
	}	
    }
    
    Patient get() {
	return P;
    }
}
