package org.test.report;

import org.junit.Assert;
import org.junit.Test;


public class A {
	@Test
	public void testA1() {
		System.out.println("TestA1");
	}
	
	@Test
	public void testA2() {
		Assert.assertTrue("test failure", false);
		System.out.println("TestA2");
		

}
	@Test
	public void testA3() {
		System.out.println("TestA3");
	}
}