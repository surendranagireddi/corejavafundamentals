package com.suren.mphasis;

public class Employee {
	int salary =100;
	int phoneNumber = 918281233;
	String address = "Banglore";
	static String  companyName ="Mphasis";
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.salary);
		System.out.println(emp.address);
		System.out.println(emp.phoneNumber);
		//System.out.println(emp.companyName);
		System.out.println(Employee.companyName);
		
	}

}
