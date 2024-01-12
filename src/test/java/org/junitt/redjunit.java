package org.junitt;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.Redbus;

public class redjunit extends BaseClass {
	

	@BeforeClass
	public static void beforeclass() {
		browserlaun("chrome");
		time(10);
		System.out.println("---bc");

	}
	@AfterClass
	public static void afterclass() {
		quit();
		System.out.println("AC----");
	}
	
	@Test
	public void test1() {
	    urllaunch("https://www.redbus.in/");
		Redbus b=new Redbus();
		click(b.getAccount());
		click(b.getLogin());
		
		sendkeys(b.getPhone(),"152679");
		confirm(); 
	}
}
