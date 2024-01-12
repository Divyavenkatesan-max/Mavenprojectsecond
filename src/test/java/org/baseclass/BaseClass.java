 package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
//	public static WebDriver  LaunchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		return driver;
//		
//
//	}
	
//	public static WebDriver Browserla(String browsernme) {
//		if (browsernme.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver =new ChromeDriver();
//			
//		}
//		else if (browsernme.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			 driver=new EdgeDriver();
//		}
//		
//		else if (browsernme.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			 driver=new FirefoxDriver();
//		}
//		return driver;
//		
//		
//
//	}
	
	public static WebDriver browserlaun(String name) {
		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
		   break;

		default:
			System.out.println("INVALID");
			
			
		}
		return driver;
		

	}
	public static void urllaunch(String e) {
		driver.get(e);
		driver.manage().window().maximize();

	}
	public static void time(long sec) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	public static void sendkeys(WebElement e, String name) {
		e.sendKeys(name);

		
		
		

	}
		
	public  static void click(WebElement s) {
		s.click();
	
		

	}
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();

	}
	public static String currenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}


	public  static String getattribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute; 
		
	}
	
	public static String getattributes(WebElement s) {
		String attribute = s.getAttribute("innerText");
		return attribute;
	}
	
	
	public  static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	//Action//move to element
	
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();

	}
	
	public static void dragdrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}
	
	public static void contextclicl(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
		
		
	}
	public static void doubleclk(WebElement s) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		

	}
	
	//Alert
	public static void simplealert() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	
	public static void promptalert() {
		Alert a=driver.switchTo().alert();
		a.dismiss();

	}
	//confirm
	
	public static void confirm() {
		Alert s=driver.switchTo().alert();
		s.accept();
				
		

	}
	//select
	
	public static void Selectin(WebElement e,int index) {
		Select s1=new Select(e);
		s1.selectByIndex(index);

	}
	public static void selectbyvalue(WebElement e1, String value) {
		Select s2=new Select(e1);
		s2.selectByValue(value);

	}
	
	public static void visible(WebElement e2, String Text) {
	Select s3=new Select(e2);
	s3.selectByVisibleText(Text);

	}
	
	public static void getoption(WebElement e3) {
		Select s3=new Select(e3);
		List<WebElement> op = s3.getOptions();
		WebElement w = op.get(0);
		String text = w.getText();
		

	}
	
	public static void forloopget(WebElement e3 ) {
		Select s3=new Select(e3);
		List<WebElement> op = s3.getOptions();
		for (int i = 0; i < op.size(); i++) {
			WebElement w = op.get(i);
			String text = w.getText();	
			
		}	
	}
	public static void getall(WebElement e3 ) {
		Select s3=new Select(e3);
		List<WebElement> all = s3.getAllSelectedOptions();
		for( int i=0; i<all.size(); i++) {
        WebElement w = all.get(i);
        String text = w.getText();
        System.out.println(text);
		}	
	}
	
	public static void enhance(WebElement e3) {
		Select s3=new Select(e3);
		List<WebElement> all = s3.getAllSelectedOptions();
		for(WebElement a:all  ) {
			System.out.println(a.getText());
		}
	}
	//deselct
	
	public static void deselctindex(WebElement e) {
		Select s1=new Select(e);
		s1.deselectByIndex(0);

	}
	public static void firstselection(WebElement e){
		
		Select s3=new Select(e);
		WebElement first = s3.getFirstSelectedOption();
		String text = first.getText();
		
		
	}
	//navigation
	public static void navito() {
		driver.navigate().to("string");

	}
	
	public static void forwrd() {
		driver.navigate().forward();

	}
	
	public static void refresh() {
		driver.navigate().refresh();

	}
	
	//window handling
	
	public static void getwindow() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		

	}
	
	public static void getwindows() {
	//handle
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
	//handles	
		
	Set<String> allid = driver.getWindowHandles();
	for (String child : allid) {
		if (!parent.equals(child)) {
			System.out.println(child);		
		}	
	}
	}
	public static void jssendkeys( String value, WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+value+"')", e);
	}

	public static String excel(String exlname, String sheet, int rowno,int cellno) throws IOException {
       File f=new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\"+exlname+".xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet(sheet);
		
		Row row1 = s.getRow(rowno);
		Cell cell = row1.getCell(cellno);
	    String value;
	int cellType = cell.getCellType();
	if(cellType==1) {
		 value = cell.getStringCellValue();
	
	}
	else if(DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat sd=new SimpleDateFormat("DD-MM-YYYY");
		 value = sd.format(d);
		
	}
	else {
		double nv = cell.getNumericCellValue();
		long l=(long)nv;
		 value = String.valueOf(l);
		
	}
	return value;
	
	
	}	
	
	public static void Excelwrite(String name, String sheetn, int rowno, int cellno,String data) throws IOException {
		File f= new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\resources\\"+name+".xlsx");
		
		Workbook w=new XSSFWorkbook();
		
		Sheet sheet = w.createSheet(sheetn);
		Row row = sheet.createRow(rowno);
		Cell cell = row.createCell(cellno);
		
		cell.setCellValue(data);
		
		FileOutputStream fo=new FileOutputStream(f);
		
		w.write(fo);
	

	}
	

	}

