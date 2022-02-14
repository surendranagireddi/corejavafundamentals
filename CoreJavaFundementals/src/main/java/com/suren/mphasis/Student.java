package com.suren.mphasis;

public class Student {
	
	  public void study() {
		  System.out.println("Student is studying");
	  }
	  public void sleep() {
		  System.out.println("Student is sleeping");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int rollNumber = 1234;
	  String name ="Abc";
		  
		 Student st = new Student();
		 st.study();
		 st.sleep();
		System.out.println(rollNumber);
		System.out.println(name);	
		
	}
	
}
