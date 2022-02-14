package com.suren.mphasis;

public class EmployeeDemo {
	
	int salary = 200;
	String company ="Mphasis";
	String address ="Bangalore";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo  emp = new EmployeeDemo();
		System.out.println(emp.company);
		emp.work();
		System.out.println(new EmployeeDemo().salary);
		
	}
	public void work() {
		System.out.println("IT software working");
	}

}
