package com.cloudvandana.assignment;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void displayDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
	}

	public static void main(String args[]) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Mr Noman", 50000));
		list.add(new Employee(2, "Mr Shritej", 70000));
		list.add(new Employee(3, "Mr Zain", 40000));

		System.out.println("*** Employee Details ***");
		for (Employee e : list) {
			e.displayDetails();
		}

	}
}
