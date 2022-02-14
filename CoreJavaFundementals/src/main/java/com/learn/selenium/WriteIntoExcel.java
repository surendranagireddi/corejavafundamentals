package com.learn.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/main/resources/data.xlsx");
		FileWriter fw = new FileWriter(file);
		FileInputStream fs = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Mphasis");
		
		Row row = sheet.getRow(2);
		Cell cell =row.getCell(1);
		cell.setCellValue("Surujana");
		
		FileOutputStream fss =new FileOutputStream(file);
		wb.write(fss);
		

	}

}
/*
 * public static void main(String[] args) throws IOException {
 * 
 * File file=new File("src/main/resources/data.xlsx"); FileInputStream fs=new
 * FileInputStream(file); XSSFWorkbook wb = new XSSFWorkbook(fs); XSSFSheet
 * sheet = wb.getSheet("Sheet1"); Row row=sheet.getRow(2); Cell cell =
 * row.getCell(1); cell.setCellValue("SAGAR"); FileOutputStream os = new
 * FileOutputStream(file); wb.write(os);
 * System.out.println("Wrote in Excel file"); }
 */
