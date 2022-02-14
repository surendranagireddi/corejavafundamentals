package com.learn.selenium;

public class CatchBlockDemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
	}

	private static void test() {
		// TODO Auto-generated method stub
		show();
	}

	private static void show() {
		// TODO Auto-generated method stub
		System.out.println("Mphasis"); //Mphasis
	try {
			System.out.println(10/0); //abnormally risky code
		}catch(ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println(ae.getMessage());
			//System.out.println("You can not divided this item by zero");
		System.out.println(ae.toString()); // java.lang.ArithmeticException
			
		} /*
			 * catch(Exception e) { e.printStackTrace(); e.getMessage(); e.toString(); }
			 */
	}
}


