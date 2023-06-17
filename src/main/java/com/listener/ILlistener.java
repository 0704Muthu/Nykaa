package com.listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.ImplememntBase;

public class ILlistener extends ImplememntBase implements IExecutionListener,ITestListener {
	public void onExecutionFinish() {
		long endTime= System.currentTimeMillis();
		System.out.println("Inform all the suite have finished execution at"+ endTime);

	}

	public void onExecutionStart() {
		long startTime= System.currentTimeMillis();
		System.out.println("Inform all the suite have started execution at"+ startTime);

	}


	public void onTestStart(ITestResult result) {
		System.out.println(result.getTestName());
		System.out.println(result.getStartMillis());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getTestName());
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getMethod());
		scr();
	}
	public void onTestFailure(ITestResult result) {
		scr();

	}
	public void onFinish(ITestContext context) {
		System.out.println(context.getPassedTests());
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getPassedTests());
	}
}
