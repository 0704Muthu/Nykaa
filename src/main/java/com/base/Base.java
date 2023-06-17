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

public abstract class Base {
	
	public abstract void browserLaunch(KeysElement value);
	public abstract void passData(WebElement element,String values);
	public abstract void getUrl(String url);
	public abstract void clickOnElement(WebElement element);
	public abstract void moveToElement(WebElement element);
	public abstract void windowHandling(String name);
	public abstract void frame(int index);
	public abstract String explicityWait(WebElement element);
	public abstract void robot() throws AWTException;
	public abstract void scanner(WebElement element);
	public abstract void clickMouse(WebElement element);
}
