package org.junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

	@Before
	public void Before() {
		System.out.println("----Before----");

	}
	
	@BeforeClass
	public static void bclss() {
		System.out.println("----Before class----");
		

	}
	@After
	public void after() {
		System.out.println("----After----");

	}
	@Test
	public void test1() {
		System.out.println("----test1------");

	}
	
	@AfterClass
	public static void aclass() {
		System.out.println("----After class----");
}
}
