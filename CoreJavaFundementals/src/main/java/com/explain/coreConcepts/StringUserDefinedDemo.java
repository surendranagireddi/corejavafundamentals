package com.explain.coreConcepts;

import java.util.Scanner;

public class StringUserDefinedDemo {
	public static void main(String[] args) {
		StringUserDefinedDemo obj = new StringUserDefinedDemo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		String name =sc.nextLine();
		String val = obj.stringdemo(name);
		System.out.println(val);
		sc.close();
		
	}
	public String stringdemo(String name){
		
		name = "hi " +name;
		return name;
	}

}
