package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollno;

	private String name;

	private String address;

	private float marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String address, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

}
