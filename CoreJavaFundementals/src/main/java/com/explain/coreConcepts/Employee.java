package com.explain.coreConcepts;

public class Employee {
	int salary;
	String name;
	
	
	Employee(int salary,String name)
	{
		this.name=name;
		this.salary = salary;
		System.out.println("Constructor special type of methods ");
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(salary);
	}
	
	static String companyName="Mphasis";
	public static void main(String[] args) {
		Employee obj1 =new Employee(100 ,"ABC");
		System.out.println(obj1.name);
		System.out.println(obj1.salary);
		obj1.display();
		
		
		Employee obj2 = new Employee(200 ,"dhf");
		System.out.println(obj2.name); //null
		System.out.println(obj2.salary); //0
		obj2.display();
		
		Employee obj3 = new Employee(300,"DEF");
		System.out.println(obj3.name); 
		System.out.println(obj3.salary);
		obj3.display();
		
		Employee obj4 = new Employee(400,"SRH");
		System.out.println(obj4.name); 
		System.out.println(obj4.salary);
		obj4.display();
		
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Employee obj = new Employee(); obj.test();
	 * 
	 * } public void test() { System.out.println("Mphasis"); }
	 */

}
