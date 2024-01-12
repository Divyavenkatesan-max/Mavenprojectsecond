package org.project1;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.hotel;

public class Adactinhotel extends BaseClass{

	@BeforeClass
	public static void before() {
		 browserlaun("chrome");
		 time(10);
	}
//	@AfterClass
//	public static void after() {
//		 quit();
//	}
	@Test
	public void ahotel() {
		 urllaunch("http://adactinhotelapp.com/");
		 hotel h=new hotel();
		 sendkeys(h.getUsername(), "Divyavijayakalav");
		 sendkeys(h.getPassword(),"Divya@98");
         click(h.getLogin());
         Selectin(h.getLocation(),5);
         Selectin(h.getHotels(),1);
         Selectin(h.getRoom(),3);
         Selectin(h.getNumber(),5);
         sendkeys(h.getIndate(),"02/12/2023");
         sendkeys(h.getOutdate(),"03/12/2023");
         Selectin(h.getAdult(),2);
         Selectin(h.getChildren(),2);
         click(h.getSearch());
         click(h.getRadio());
         click(h.getCntbtn());
         sendkeys(h.getFirstnm(),"Swathi");
         sendkeys(h.getLastnm(),"D");
         sendkeys(h.getAddrss(),"no 10, chenni");
         sendkeys(h.getCredit(),"1472583699632587");
         Selectin(h.getCardno(),3);
         Selectin(h.getEprdate(),6);
         Selectin(h.getEpryear(),15);
         sendkeys(h.getCvv(),"1471");
         click(h.getBook());
         System.out.println(getattribute(h.getOrder()));
     
         
         
         
         
         
         
         
         
         
         
         
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
