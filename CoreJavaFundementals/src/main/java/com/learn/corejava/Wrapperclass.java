package com.learn.corejava;



public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =10;
		Integer obj = new Integer(1);
		System.out.println(obj);
		String st = "1234";
		Integer ob = Integer.valueOf(st);
		System.out.println(st instanceof String);
		System.out.println(ob instanceof Integer);
		
		
		
		
	}

}
