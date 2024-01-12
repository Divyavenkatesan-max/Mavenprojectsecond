package org.junitt;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Loginpage;
import org.pom.Registration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyFac extends BaseClass {
	
	@Before
	public void before() {
		System.out.println("Before Date"+new Date());
		System.out.println("Before");

	}

	@After
	public void after() {
		System.out.println("After Date"+new Date());
		System.out.println("after");

	}
	
	
	static WebDriver driver;
	@BeforeClass

	public static void Beforeclass() {
	browserlaun("chrome");
	time(10);

	}
	
	
		
	
	@Test
	public void test2() {
//	 Assert.assertTrue("verify the url",currenturl().contains("facebook"));
	 urllaunch("https://www.facebook.com/");
	 Registration r=new Registration();
	 
     click(r.getCrtbtn());
     sendkeys(r.getFirstname(),"Divya");
     sendkeys(r.getLastname(),"Bharathi");
     System.out.println("---Test2------");
     

	}

	
	@Test
	public void test1() {
		urllaunch("https://www.facebook.com/");
		Assert.assertTrue("verify the url",currenturl().contains("facebook"));
		
		
		Loginpage l=new Loginpage();
		sendkeys(l.getTxtuser(),"Divya");
		Assert.assertEquals(getattribute(l.getTxtuser()), "Divya");
		
		sendkeys(l.getTxtpass(),"1234");
		Assert.assertEquals(getattribute(l.getTxtpass()), "1234");
		
		click(l.getClk());
		Assert.assertTrue("am invalid", currenturl().contains("privacy"));
     
     
     System.out.println("---Test1------");
	}
	
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	@AfterClass
	public static void afterclass() {
		quit();
		System.out.println("afterclass");

	}


	
	
}