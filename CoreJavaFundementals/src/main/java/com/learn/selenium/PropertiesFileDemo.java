package com.learn.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("src/main/resources/data1.properties");
		
		FileInputStream fs = new FileInputStream(file);
		
	   Properties prp = new Properties();
	   prp.load(fs);
	   
	   String strName =prp.getProperty("name");
	   String town = prp.getProperty("hometown");
	   System.out.println(strName);
	   System.out.println(town);
	   
	}

}
