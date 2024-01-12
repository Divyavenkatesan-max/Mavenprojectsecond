package org.junitt;

import org.baseclass.BaseClass;
import org.bouncycastle.jcajce.provider.keystore.BC;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.flipcard;



public class flipcardjunit  extends BaseClass{
	
	@BeforeClass
	public static void before() {
		browserlaun("chrome");
		time(10);

	}
	@Test
	public void test1() {
		
		urllaunch("https://www.flipkart.com/account/login");
		Assert.assertTrue("verify the url",currenturl().contains("flipkart"));
		
		
		flipcard f=new flipcard();
		sendkeys(f.getPh(), "8220405259");
		Assert.assertEquals(getattribute(f.getPh()), "8220405259");
		
		click(f.getOtp());
	}

}
