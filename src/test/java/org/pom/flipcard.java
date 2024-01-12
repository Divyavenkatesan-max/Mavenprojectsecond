package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipcard extends BaseClass{
	
	public flipcard() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement ph;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;

	public WebElement getOtp() {
		return otp;
	}

	public void setOtp(WebElement otp) {
		this.otp = otp;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPh() {
		return ph;
	}
}
