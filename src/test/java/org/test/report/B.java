package org.test.report;

import org.junit.Assert;
import org.junit.Test;

public class B {
		@Test
		public void testB1() {
			System.out.println("TestB1");
		}
		
		@Test
		public void testB2() {
			Assert.assertTrue("test failure", false);
			System.out.println("TestB2");
			

	}
		@Test
		public void testB3() {
			System.out.println("TestB3");
		}
	}


