package com.learn.selenium;

public class PrizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Hi");
			System.out.println(10/0);
			
		}catch(ArithmeticException ae) {
			System.out.println("catch");
			//ae.printStackTrace();
		}catch(Exception e) {
			
		}
		System.out.println("Bye");
	}

}
