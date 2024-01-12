package org.execution;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pom.Loginpage;
import org.pom.Registration;

public class Main extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserlaun("chrome");
		urllaunch("https://www.facebook.com/");
		time(10);
//		Loginpage l= new Loginpage();
//        
////		sendkeys(l.getTxtuser(),"Divya");
////		sendkeys(l.getTxtpass(),"1234");
////		
////		refresh();
////		sendkeys(l.getTxtuser(),"bharathi");
////		sendkeys(l.getTxtpass(),"1234");
//		
//		   sendkeys(l.getTxtuser(), excel("DataDriven", "Sheet2", 0, 1));
//		   sendkeys(l.getTxtpass(), excel("DataDriven", "Sheet2" ,0, 0));
//		 
//		
////		Excelwrite("sample", "sheet1", 0, 0, "dummy");
	
		Registration r=new Registration();
		r.getCrtbtn().click();
		sendkeys(r.getFirstname(),"Divya");
		sendkeys(r.getLastname(),"bharathi");
	
	}
	
	
	
	

}
 