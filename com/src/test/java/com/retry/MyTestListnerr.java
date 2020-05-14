package com.retry;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestListnerr extends TestListenerAdapter{
	
	static MyTestResults results = new  MyTestResults();
	
	@Override
	  public void onTestSuccess(ITestResult testResult) {
		System.out.println(testResult.getName() +"$$$$Success$$");
		results.incrementPassed();
		System.out.println("PASSED TEST:    "+results.getPassed());
	  }

	  @Override
	  public void onTestFailure(ITestResult testResult) {
		  
		  System.out.println(testResult.getName() +"$$$$$$$$Failed$$$$$$$");
		  results.incrementFailed();
		  System.out.println("Failed TEST:    "+results.getFailed());
	  }

	  @Override
	  public void onTestSkipped(ITestResult testResult) {
		  System.out.println(testResult.getName() +"Skipped");
	  }

	  @Override
	  public void onFinish(ITestContext testContext) {
		  System.out.println("TOTAL NUMBER OF TEST"+results.totalTest());
		  try {
			results.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }


	
	

}
