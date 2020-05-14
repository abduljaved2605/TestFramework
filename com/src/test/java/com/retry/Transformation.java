package com.retry;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
public class Transformation implements IAnnotationTransformer

{
	public void transform(ITestAnnotation anno,Class testclass,Constructor cons, Method me)
	{
		anno.setRetryAnalyzer(Retry.class);
	}
	
}
