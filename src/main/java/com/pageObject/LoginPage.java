package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

	WebDriver driver  ;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//POJO-->Plain Old Java Object

	private String user() {
		Log mail=Log.email;
		return mail.toString();	// TODO Auto-generated method stub

	}

//	@FindBy(name=)
//	private WebElement username;

	@FindBy(name ="password")
	private WebElement userpassword;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;



//	public WebElement getUsername() {
//		return username;
//	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getLoginButton() {
		
		return loginButton;
	}

}
