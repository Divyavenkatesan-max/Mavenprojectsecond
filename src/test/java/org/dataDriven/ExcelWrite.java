package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public  static void main(String[] args) throws IOException {
		
		//create row and colums
//		File f= new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\write1.xlsx");
//		
//		Workbook w=new XSSFWorkbook();
//		
//		Sheet sheet = w.createSheet("amazon");
//		Row row = sheet.createRow(0);
//		Cell cell = row.createCell(0);
//		
//		cell.setCellValue("Serialno");
//		
//		FileOutputStream fo=new FileOutputStream(f);
//		
//		w.write(fo);
	
//	}}
//		//same rows added cell value
		
//	    File f= new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\write1.xlsx");
//	    FileInputStream fi=new FileInputStream(f);
//	    
//		Workbook w=new XSSFWorkbook(fi);
//		
//		Sheet sheet = w.getSheet("amazon");
//		Row row = sheet.getRow(0);
//		Cell createCell = row.createCell(0);
//		
//		createCell.setCellValue("serial");
//        
//		FileOutputStream fo=new FileOutputStream(f);
//		
//		w.write(fo);
//	}}

		File f= new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\write1.xlsx");
	    FileInputStream fi=new FileInputStream(f);
	    
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet sheet = w.getSheet("amazon");
		Row row = sheet.getRow(0);
		Cell createCell = row.getCell(0);
		
		String s1 = createCell.getStringCellValue();
		
		if (s1.equals("serial")) {
			
			createCell.setCellValue("serialNo");
	        
			
		}
		FileOutputStream fo=new FileOutputStream(f);
		
		w.write(fo);
	}}
	
		
		
		
		