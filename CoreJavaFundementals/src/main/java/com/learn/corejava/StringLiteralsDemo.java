package com.learn.corejava;

public class StringLiteralsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Mphasis"; //literals // 1 obj is created
		String s2 = "Mphasis";
		
		s1.concat("The Next Applied");
	String s3=s1.concat("The next Applied");
		
		
		// string is immutable
		
		System.out.println(s3);
		// this not changeble behaviour called as Immutable
		// String is immutable

		String obj = new String("Mphasis"); 
		
	}

}
