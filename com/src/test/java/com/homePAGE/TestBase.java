package com.homePAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	static WebDriver driver;
	
	public static WebDriver driver()
	{
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		if(driver == null)
		driver = new ChromeDriver();
		
		return driver;
		
		
	}
	

	
	public static void waitForElement()
	{
		//WebDriver driver=driver();
		WebDriverWait wait = new WebDriverWait(driver,10000);
		System.out.println("********Inside generic");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test5-button\"]")));
		//Thread.sleep(10000);
		WebElement butod= driver().findElement(By.xpath("//*[@id=\"test5-button\"]"));
	}

}
