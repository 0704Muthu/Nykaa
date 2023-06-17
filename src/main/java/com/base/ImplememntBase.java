package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.listener.KeysElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplememntBase extends Base {
	public static WebDriver driver;
	Actions act;
	static Robot rbt;

	@Override
	public void browserLaunch(KeysElement value) {
		if (value==KeysElement.Chrome) {
			ChromeOptions p = new ChromeOptions();
			p.addArguments("--disable-notifications");
			p.addArguments("--incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(p);
		
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();//window maximize
		}else if (value==KeysElement.firefox) {
			FirefoxOptions firefox = new FirefoxOptions();

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(firefox);
			driver.manage().window().maximize();		
		}
	}
	
	public static void scr() {
		
		try {
			rbt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rbt.keyPress(KeyEvent.VK_WINDOWS);
		rbt.keyPress(KeyEvent.VK_PRINTSCREEN);
		
	}

	@Override
	public void passData(WebElement element, String values) {
		element.sendKeys(values);		
	}


	@Override
	public void getUrl(String url) {
		driver.get(url);

	}

	@Override
	public void clickOnElement(WebElement element) {
		element.click();

	}

	@Override
	public void moveToElement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	@Override
	public void windowHandling(String name) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(driver.switchTo().window(string).getTitle().equals(name)) {
				break;
			}
		}

	}

	@Override
	public void frame(int index) {

		driver.switchTo().frame(index);	
	}

	@Override
	public String explicityWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();		
	}

	@Override
	public void robot() throws AWTException {
		Robot ref = new Robot();
		ref.keyPress(KeyEvent.VK_TAB);
		ref.keyRelease(KeyEvent.VK_TAB);
	}

	
	@Override
	public void scanner(WebElement element) {
		Scanner ref  = new Scanner(System.in);
		System.out.println("Enter the otp");
		String nextLong = ref.next();	
		element.sendKeys(nextLong);
		ref.close();
	}

	@Override
	public void clickMouse(WebElement element) {
		act.click(element).perform();		
	}
	
	
	
	






}