package com.listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Li  implements IAnnotationTransformer{
	int counter=3;
	
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
			System.out.println("Changing invocation for the following method: " + testMethod.getName());
			testAnnotation.setInvocationCount(counter);

			}
	}
	
}
