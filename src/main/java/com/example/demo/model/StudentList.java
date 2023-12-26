package com.example.demo.model;

public class StudentList {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentList(String name, String emaill, int id) {
		super();
		this.name = name;
		this.emaill = emaill;
		this.id = id;
	}
	public String getEmaill() {
		return emaill;
	}
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String emaill;
    private int id;
    
}
