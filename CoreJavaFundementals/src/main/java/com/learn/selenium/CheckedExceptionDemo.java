package com.learn.selenium;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter ob = null;
		try {
			ob = new PrintWriter("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob.write("Mphasis");

	}

}
