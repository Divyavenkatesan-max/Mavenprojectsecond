package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbus extends BaseClass {
	
	public Redbus() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Account']")
	private WebElement account;
	
	@FindBy(xpath="//span[text()='Login/ Sign Up']")
	private WebElement loginbtn;
	
	@FindBy(id="mobileNoInp")
	private WebElement phone;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLogin() {
		return loginbtn;
	}

	public WebElement getPhone() {
		return phone;
	}
			

}


