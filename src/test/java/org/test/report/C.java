package org.test.report;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class C {

	
	@Test
	public void testC1() {
		System.out.println("TestC1");
	}
	
	@Test
	public void testC2() {
		System.out.println("TestC2");
		Assert.assertTrue("test failure", false);

}
	@Ignore
	@Test
	public void testC3() {
		System.out.println("TestC3");
	}
}
