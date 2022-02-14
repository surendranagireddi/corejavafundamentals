package com.learn.corejava;

public class StringWithNewKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = new String("Mphasis");
		String obj2 = new String("Mphasis");
		
		obj1.concat("The Next Applied"); // Garbage Collection
		String obj3 = obj1.concat("The Next Applied");
		System.out.println(obj1);
		
		System.out.println(obj2);
		System.out.println(obj3);

	}

}
