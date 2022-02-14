package com.learn.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.scene.control.Cell;

public class ReadExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//data xlsx
		File file = new File("src/main/resources/data.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("sheet1");
		XSSFSheet sheet = wb.getSheet("Mphasis");
		Row row = sheet.getRow(2);
		
		//Cell cell =row.getCell(1);
		
	//	String st =  cell.getStringCellValue();
	//	System.out.println(st);
		
		
		
		
		
		
		
		
		

	}

}
