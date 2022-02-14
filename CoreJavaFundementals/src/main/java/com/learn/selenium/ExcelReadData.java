package com.learn.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		File file = new File("src/main/resources/data.xlsx"); // creating the new File Instance
		FileInputStream fis = new FileInputStream(file); // obtain the file
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); // 2007xlsx XSSFWorkbook ,2003 xls XHHSSF
		
		//HSSFWorkbook
		
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		sheet.getRow(0);
		Iterator<Row> itr = sheet.iterator();
		
		while(itr.hasNext()) {
			Row row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // iterator overeach column
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:    // field that represent String cell type
					System.out.println(cell.getStringCellValue()+"\t\t\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t\t\t");
					break;
					default:	
					
				}
			}
			System.out.println("");
		}

	}
catch(Exception e) {
	e.printStackTrace();
}
}
}
