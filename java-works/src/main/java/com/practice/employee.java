package com.practice;

public class employee {
		
	private int id;
	private String name;
	private double salary;
	private String email;
	
	
	public void setId(int id) {
		if(id < 1) {
			this.id = 1000;	
		}else {
			this.id = id;
		}
	}
	
	public void setName(String name) {
		if(name.length() < 6) {
			this.name = "No Name";
		}else {
			this.name = name;
		}
		
	}
	
	public void setSalary(double salary) {
		if(salary < 1000) {
			this.salary = 1000;
		}else {
			this.salary = salary;
		}
	}
	
	public void setEmail(String email) {
		if(!email.contains("@")) {
			this.email = "example@gmail.com";
		}else {
			this.email = email;
		}
	}
	
	public void display() {
		System.out.println("Emp Id: " + id);
		System.out.println("Emp Name: " + name);
		System.out.println("Emp Salary: " + salary);
		System.out.println("Emp email: " + email);
	}

	}

