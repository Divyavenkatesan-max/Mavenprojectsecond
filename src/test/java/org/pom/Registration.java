package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends BaseClass {
	
	public Registration() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	 private WebElement crtbtn;
	@FindBy(name="firstname")
	 private WebElement firstname;
	
	@FindBy(name="lastname")
	 private WebElement lastname;
	
	
	public WebElement getCrtbtn() {
		return crtbtn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}

	 

}
