package com.codegnan.oopprograms;

public class Employee_01 {
	String name;
	double basicSalary;

	public void setDetails(String n, double salary) {
		name = n;
		basicSalary = salary;
	}

	public double calculateHRA() {
		return 0.20 * basicSalary;
	}

	public double calculateDA() {
		return 0.10 * basicSalary;
	}

	public double grossSalary() {
		return basicSalary + calculateHRA() + calculateDA();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_01 emp = new Employee_01();
		emp.setDetails("malli", 60000);
		double grossSalary = emp.grossSalary();
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Basic Salary: " + emp.basicSalary);
		System.out.println("Employee Basic Salary: " + emp.calculateHRA());
		System.out.println("Employee Basic Salary: " + emp.calculateDA());
		System.out.println("Gross Salary: " + grossSalary);
	}

}
