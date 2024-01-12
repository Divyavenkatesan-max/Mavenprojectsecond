package org.junitt;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.hotel;

public class hotel1 extends BaseClass {
	
	@BeforeClass
	public static void becls() {
		browserlaun("chrome");
		time(10);
		System.out.println("---beforeclass--");
	}
	@AfterClass
	public static void afcls() {
		quit();
	    System.out.println("afterclass");
	}
	@Before
	public void before() {
		System.out.println("before "+new Date());
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after clss"+new Date());
		System.out.println("after");
	}
	
	@Test
	public void test1() throws IOException {
		
        urllaunch("http://www.adactin.com/HotelApp/");
        Assert.assertTrue("url", currenturl().contains("adactin"));
		
        hotel h=new hotel();
		
		
		sendkeys(h.getUsername(),excel("DataDriven", "Sheet2", 1, 1));
		Assert.assertEquals(getattribute(h.getUsername()), "java");
		
		sendkeys(h.getPassword(),excel("DataDriven", "Sheet2", 1, 2));
		Assert.assertEquals("pwd",getattribute(h.getPassword()), "3211456");
		
		click(h.getLogin());
		System.out.println("test1");
		
	}
	
	
	
	
	
	
	
	
	
}
