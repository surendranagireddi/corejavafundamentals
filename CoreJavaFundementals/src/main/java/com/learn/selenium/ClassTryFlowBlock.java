package com.learn.selenium;

public class ClassTryFlowBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/2);
		try {
			System.out.println(10/2);
			String s1= null;
			System.out.println(s1.length());
		}catch(ArithmeticException e) {  //Exception is the main class of all the Exception
		
			System.out.println("Exception");
		}
	catch(NullPointerException e) {
	   System.out.println("You can not create");	
		} 
//	catch(Exception e) { System.out.println("Here it will be handled"); }
			 
		
		System.out.println("Hi");

	}

}
