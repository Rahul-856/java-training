package com.practice;

public class Employeemain 
{
public static void main(String[] args) {
		
		employee emp = new employee();
		emp.setId(-20);
		emp.setName("aaaaa");
		emp.setSalary(500);
		emp.setEmail("rahul111.com");
		
		emp.display();

		
		System.out.println("---------------");
		
		employee emp1 = new employee();
		emp1.setId(1001);
		emp1.setName("Rahul Kaushik");
		emp1.setSalary(12340);
		emp1.setEmail("rk.kaushik123.com");
		
		emp1.display();
	}

}
