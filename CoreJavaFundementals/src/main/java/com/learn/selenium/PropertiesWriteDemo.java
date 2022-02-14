package com.learn.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/main/resources/data1.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		FileOutputStream fos = new FileOutputStream(file);
		Properties prop= new Properties();
		prop.load(fis);
		
	    prop.setProperty("name","Kumar");
		
		prop.store(fos, "I am going to store some value in properties file");
		
		
		
	
		
		

		
	}

}
