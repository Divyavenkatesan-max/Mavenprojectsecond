package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotel extends BaseClass {
	public hotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement number;
	
	@FindBy(id="datepick_in")
	private WebElement indate;
	
	@FindBy(id="datepick_out")
	private WebElement outdate;
	
	@FindBy(name="adult_room")	
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement children;

	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement cntbtn;
	
	@FindBy(id="first_name")
	private WebElement firstnm;
	
	@FindBy(id="last_name")
	private WebElement lastnm;
	
	
	@FindBy(name="address")
	private WebElement addrss;
	
	
	@FindBy(name="cc_num")
	private WebElement credit;
	
	@FindBy(id="order_no")
	private WebElement order;
	
	public WebElement getOrder() {
		return order;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCntbtn() {
		return cntbtn;
	}

	public WebElement getFirstnm() {
		return firstnm;
	}

	public WebElement getLastnm() {
		return lastnm;
	}

	public WebElement getAddrss() {
		return addrss;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getEprdate() {
		return eprdate;
	}

	public WebElement getEpryear() {
		return epryear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(id="cc_type")
	private WebElement cardno;
	
	@FindBy(id="cc_exp_month")
	private WebElement eprdate;
	
	@FindBy(id="cc_exp_year")
	private WebElement epryear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement book;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}
	
	
	

	

}
