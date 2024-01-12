package org.base.pom.datadriven;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pom.Loginpage;

public class facebook extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserlaun("chrome");
		time(10);
		urllaunch("https://www.facebook.com/");
		Loginpage l =new Loginpage();
	    sendkeys(l.getTxtuser(),excel("facebook","facebook", 0,0));
	    sendkeys(l.getTxtpass(),excel("facebook", "facebook", 1, 0));
	    click(l.getClk());
		
	}
	
	
	
}