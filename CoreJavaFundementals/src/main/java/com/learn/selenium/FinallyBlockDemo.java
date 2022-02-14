package com.learn.selenium;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Hi");
			System.out.println(10/0);
	//		System.out.println("Bye"); // we always put this code outside the try block
			
		}catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println(ae.toString());
		}
		
		finally {
			System.out.println("Hi finally block");
		}
		System.out.println("Bye");
	}

}
