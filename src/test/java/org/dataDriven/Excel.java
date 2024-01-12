package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


public class Excel extends BaseClass {
	public static void main(String[] args) throws IOException {

        
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\DataDriven.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("Sheet2");
		
		Row row = s.getRow(0);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		
		int pr = s.getPhysicalNumberOfRows();
		System.out.println(pr);
		
		int pc = row.getPhysicalNumberOfCells();
		System.out.println(pc);
		
		System.out.println("------cell data-----");
		for (int i = 0; i < pc; i++) {
			Cell cell1 = row.getCell(i);
			System.out.println(cell1);
			
		}
		System.out.println("------cell nd row------");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row1 = s.getRow(i);		
			
		for (int j = 0; j<row.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row1.getCell(j);
			System.out.println(cell2);
		}	
		}
	
	//sendkeys
	
	//celltype==0-number,1--(number+string)
	
	int cellType = cell.getCellType();
	System.out.println(cellType);

	if(cellType==1) {//1--chnge to string
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	else if(DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat sd=new SimpleDateFormat("DD-MM-YYYY");
		String value = sd.format(d);
		
	}
	else {
		double nv = cell.getNumericCellValue();
		long l=(long)nv;
		String value = String.valueOf(l);
		System.out.println(value);
		
	}
	
	
	}	
}
