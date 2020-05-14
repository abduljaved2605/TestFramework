
  package com.retry; import org.testng.*;
  
  public class Retry implements IRetryAnalyzer{ int counter=0; int retryCount
  =5;
  
  public boolean retry(ITestResult result) { // TODO Auto-generated method stub
  
  System.out.println("***result**"+result);
  
  if(counter <retryCount) { counter++; return true; } return false; }
  
  }
 