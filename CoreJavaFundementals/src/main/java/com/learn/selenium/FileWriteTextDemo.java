package com.learn.selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTextDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String wantToWrittenTextFile ="I am going to write into file";
		File file = new File("src/main/resources/test.txt");
		FileWriter fw = new FileWriter(file);
		
		int len =wantToWrittenTextFile.length();
		for(int i =0;i<len;i++) {
			fw.write(wantToWrittenTextFile.charAt(i));
		}
		System.out.println("completly wrote into the file");
		fw.close();
	}

}
