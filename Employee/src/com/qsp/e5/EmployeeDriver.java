package com.qsp.e5;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {
	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(5, "Sudarshan", 90000));
		al.add(new Employee(3, "Sushant", 50000));
		al.add(new Employee(2, "Pradeep", 60000));
		al.add(new Employee(1, "Kuhu", 100000));
		al.add(new Employee(4, "Darshana", 80000));
		
		for(Employee emp:al)
			System.out.println(emp);
//		al.sort(new SortBySalaryAsc());
		compare()
		System.out.println("____________________________");
		for(Employee emp:al)
			System.out.println(emp);
		
	}
}
