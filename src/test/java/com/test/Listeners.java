package com.test;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start");
		super.onTestStart(result);
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Failure");
		super.onTestFailure(tr);
	}
	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Skipped");
		super.onTestSkipped(tr);
	}
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Success");
		super.onTestSuccess(tr);
	}
}
