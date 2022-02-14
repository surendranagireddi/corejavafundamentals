package com.learn.selenium;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Hi member you can not divided by zero");
		}
		// unchecked Exception Arithmetic Exception
		System.out.println("Bye");
		
		
	}

}
