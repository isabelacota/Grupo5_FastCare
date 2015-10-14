package xyz.hidasy.rest;

import java.util.Date;

public class AuditData {

    String name;
    String cpf;
    long createdAt;
    long updatedAt;
    long birthDate;
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

    public long getCreation() {
	return createdAt;
    }
    
    public void setCreation(long d) {
	this.createdAt = d;
    }
    
    public long getUpdate() {
	return updatedAt;
    }
    
    public void setUpdate(long d) {
	this.updatedAt = d;
    }

    public long getBirth() {
	return birthDate;
    }
    
    public void setBirth(long d) {
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
