package xyz.hidasy.rest;

import java.util.Date;

public class Patient {

    String name;
    String cpf;
    Date createdAt;
    Date updatedAt;
    Date birthDate;
    String gender;
    String phone;
    String id;
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
    public String getCpf() {
	return cpf;
    }
    
    public void setCpf(String cpf) {
	this.cpf = cpf;
    }

    public Date getCreation() {
	return createdAt;
    }
    
    public void setCreation(Date d) {
	this.createdAt = d;
    }
    
    public Date getUpdate() {
	return updatedAt;
    }
    
    public void setUpdate(Date d) {
	this.updatedAt = d;
    }

    public Date getBirth() {
	return birthDate;
    }
    
    public void setBirth(Date d) {
	this.birthDate = d;
    }   
    
    public String getGender() {
	return gender;
    }
    
    public void setGender(String gender) {
	this.gender = gender;
    }
    
    public String getPhone() {
	return phone;
    }
    
    public void setPhone(String phone) {
	this.phone = phone;
    }
    
    public String getId() {
	return id;
    }
    
    public void setId(String id) {
	this.id = id;
    }
    
    @Override
    public String toString() {
	return "Pacient [name=" + name + ", id=" + id + "]";
    }
}
