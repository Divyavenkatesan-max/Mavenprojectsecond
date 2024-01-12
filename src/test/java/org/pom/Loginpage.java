package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email")
	private WebElement txtuser;
	@FindBy(id="pass")
	private WebElement txtpass;
	@FindBy(name="login")
	private WebElement clk;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getClk() {
		return clk;
	}


	
	
	
	
//	@CacheLookup
//	@FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
//	private WebElement txtuser;
//	@FindAll({@FindBy(name="pass"),@FindBy(id="pass")})
//	private WebElement txtpass;
//	
//	public WebElement getTxtuser() {
//		return txtuser;
//	}
//
//	public WebElement getTxtpass() {
//		return txtpass;
//	}

	

}
