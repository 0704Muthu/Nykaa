package com.test;

import com.base.TestBase;
import com.pageObject.PageObjectManger;

public class TestLogin extends TestBase{

	public static void main(String[] args) {
		PageObjectManger pom = new PageObjectManger(driver);
		browserLaunch(pom.getPof().propertyFIle().getProperty("browser"));
	}
	
	

}
