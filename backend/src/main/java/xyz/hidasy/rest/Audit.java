package xyz.hidasy.rest;

public class Audit {

    String User;
    String Action;
    String Date;
    long id;
    
    public String getUser() {
	return User;
    }
    
    public void setUser(String user) {
	this.User = user;
    }
    
    public String getAction() {
	return Action;
    }
    
    public void setAction(String action) {
	this.Action = action;
    }

    public String getDate() {
	return Date;
    }
    
    public void setDate(String date) {
	this.Date = date;
    }
    
    public long getId() {
	return id;
    }
    
    public void setId(long Id) {
	this.id = Id;
    }

    @Override
    public String toString() {
	return "Audit Trail object";
    }
}
