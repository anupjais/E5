package com.qsp.e5;

public class Employee {
	int id;
	String name;
	double sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", sal=" + sal;
	}
	
}
