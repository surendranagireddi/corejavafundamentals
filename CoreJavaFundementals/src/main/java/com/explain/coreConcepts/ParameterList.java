package com.explain.coreConcepts;

import java.util.Scanner;

public class ParameterList {
	
	public static void main(String[] args) {
		
		ParameterList obj = new ParameterList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNumber = sc .nextInt();
		System.out.println("Enter second number");
		int secondNumber = sc .nextInt();
		
		
		
		sc.close();
		
	int addValue = obj.add(firstNumber, secondNumber);
	 System.out.println("addition" +addValue);
	 
	 int subValue = obj.substraction(firstNumber, secondNumber);
	 System.out.println("substraction" +subValue);
	 
	 
	 int mulValue = obj.multiplication(firstNumber, secondNumber);
	 System.out.println("multiplication " +mulValue);
	 
	 
	 
		String st = obj.test("ABC");
		System.out.println(st);
		
	}
	
	public int add(int i , int k) {
		return i+k;
	}
	public int substraction(int i, int k) {
		return i-k;
	}
	
	public int multiplication(int i, int k) {
		return i*k;
	}
	

	public String test(String companyName){
		return companyName;
	}
}
