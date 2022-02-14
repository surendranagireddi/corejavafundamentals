package com.explain.coreConcepts;

import java.util.Scanner;

public class TwoStringsAdd {
	
	public static void main(String[] args) {
		
		TwoStringsAdd obj = new TwoStringsAdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your firstname");
		 String firstName = sc.nextLine();
		 System.out.println("enter your second name");
		 String secondName = sc.nextLine();
		  sc.close();
		 String val = obj.addTwoStrings(firstName, secondName);
		 System.out.println("Full name: " +val);
		 
		
	}
	
	public String addTwoStrings(String firstName,String secondName) {
		return   firstName +""+ secondName ;
		
	}

}
