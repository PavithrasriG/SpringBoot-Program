package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	@Autowired
	Course course; // another class injected in student class
	private int sid;
	private String sname;
	
	
	// generate the getter and setter method
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	// generate the tostring
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	// generate the constructor using field
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	// generate the constructor superclass (without argument)
	public Student() {
		super();
		System.out.println("Constructor");
	}
	
	public void display() {
		System.out.println("Student display method");
		
	}
	
	
	
}
