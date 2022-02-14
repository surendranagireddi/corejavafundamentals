package com.learn.selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("Hello.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str ;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
		

	}

}
