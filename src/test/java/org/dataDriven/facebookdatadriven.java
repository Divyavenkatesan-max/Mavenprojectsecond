package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class facebookdatadriven {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\facebook.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);	
	   Sheet s = w.getSheet("facebook");
	   Row r = s.getRow(1);
	   Cell cell = r.getCell(0);
//	   cell.setCellValue("pwd1234");
//	   FileOutputStream fo=new FileOutputStream(f);
//	   w.write(fo);
//	
	   int cellType = cell.getCellType();
	   if(cellType==1) {
		   String value = cell.getStringCellValue();
		   System.out.println(value);   
		   
	   }
	   else if(DateUtil.isCellDateFormatted(cell)) {
		   Date da = cell.getDateCellValue();
		   SimpleDateFormat s1=new SimpleDateFormat("DD-MM-YYYY");
		   String format = s1.format(da);
	   }
	   
	   else {
		   double nv = cell.getNumericCellValue();
		   long l=(long)nv;
		   String value = String.valueOf(l);
	   }
	   }
	   
	  	
	

	
    

}
