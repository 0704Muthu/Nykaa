package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.base.TestBase;

public class HomePage extends TestBase{

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='skin'])[2]")
	private WebElement skin;
	

	@FindBy(xpath="(//a[contains(text(),'Face Wash')])[2]")
	private WebElement facewash;

	@FindBy(xpath="//div[text()='Simple Kind To Skin Refreshing Facial Wash']")
	private WebElement natural ;
	
	
	public WebElement getNatural() {
		return natural;
	}



	public WebElement getSkin() {
		return skin;
	}



	public WebElement getFacewash() {
		return facewash;
	}
	
	
}
