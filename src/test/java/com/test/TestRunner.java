package com.test;


import java.awt.AWTException;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.Base;
import com.base.TestBase;
import com.pageObject.PageObjectManger;

public class TestRunner extends TestBase{

	PageObjectManger pom = new PageObjectManger(driver);
	@BeforeClass
	private void setup() {
		String property = pom.getPof().propertyFIle().getProperty("browser");
		browserLaunch(property);
	}


	@Test
	private void SelectProduct() {
		driver.get("https://www.nykaa.com/");
		WebElement skin = pom.getHom().getSkin();
		moveToElement(skin);
		pom.getHom().getFacewash().click();
		String tabtwo="Face Wash - Buy Face Wash Online at Best Prices in India | Nykaa";
		windowHandling(tabtwo);
		clickOnElement(pom.getHom().getNatural());
	}
	
	
	@Test(dependsOnMethods = "SelectProduct")
	private void orderAProduct() {
		String third="Nykaa Naturals Face Wash: Buy Nykaa Naturals Face Wash Online at Best Price in India | Nykaa";
		windowHandling(third);
		clickOnElement(pom.getBop().getAddToBag());
		clickOnElement(pom.getBop().getOrder());
		frame(0);
		clickOnElement(pom.getBop().getCart());
	//	clickOnElement(pom.getBop().getQty());
		
		clickOnElement(pom.getBop().getProceed());


	}
	
	
	
	@Test(dependsOnMethods = "orderAProduct")
	private void login() {


		clickOnElement(pom.getBop().getLogin());
		clickOnElement(pom.getBop().getEnter());

		scanner(pom.getBop().getMobile());
		clickOnElement(pom.getBop().getProcess());
//		scanner(pom.getBop().getOtp());
		staticWait(25000);
		clickOnElement(pom.getBop().getVerify());
		clickOnElement(pom.getBop().getDeliver());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		clickMouse(pom.getBop().getCash());
		clickOnElement(pom.getBop().getPlaceorder());


	}
	
	

	@Test(dependsOnMethods = "login")
	private void cancelOrder() {


		moveToElement(pom.getBop().getAccount());
		clickOnElement(pom.getBop().getMyOrder());
		staticWait(25000);
		clickMouse(pom.getBop().getDetails());
		clickOnElement(pom.getBop().getCancel());

		//moveToElement(pom.getBop().getAccount());
		clickOnElement(pom.getBop().getReason());
		clickOnElement(pom.getBop().getWrongOrder());
		clickOnElement(pom.getBop().getCancelOrder());
		clickOnElement(pom.getBop().getConfirm());
	}

//	@AfterSuite
//	private void tearDown() {
//		exit();
//	}



}
