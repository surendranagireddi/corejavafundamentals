package com.learn.selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
  public static void main(String[] args) throws IOException {
	File f =new File("Hello.txt");
	FileReader fr = new FileReader(f);
	int ch =  fr.read();
	//System.out.println(ch);
	int c;
	while((c=fr.read())!=-1) {
		System.out.print((char)c);
		
	}
	fr.close();
}
}
