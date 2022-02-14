package com.learn.corejava;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   test();

	}
	public static void test() {
		show();
	}
	private static void show() {
		System.out.println("Mphasis");
		System.out.println(10/0);
	}

}
