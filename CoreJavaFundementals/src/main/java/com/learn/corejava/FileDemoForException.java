package com.learn.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemoForException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File obj = new File("test.txt");
		
		FileInputStream fis = new FileInputStream(obj);
		
	}

}
