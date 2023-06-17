package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.base.TestBase;
import com.utility.PropertyFile;

public class PageObjectManger extends TestBase {
	public PageObjectManger(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private HomePage hom;
	
	private BagPage Bop;
	
	private PropertyFile pof;

	public PropertyFile getPof() {
		pof=new PropertyFile();
		return pof;
	}

	public HomePage getHom() {
		hom=new HomePage(driver);
		return hom;
	}

	public BagPage getBop() {
		Bop= new BagPage(driver);
		return Bop;
	}
	
}
