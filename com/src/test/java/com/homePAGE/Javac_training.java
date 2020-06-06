package com.homePAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Javac_training {
	
	WebDriver driver =  TestBase.driver();

	
	@Test
	public void start()
	{
		driver.get("C:\\Automation\\gorm.html");
		driver.manage().window().maximize();
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("jondoe");
		
		//WebElement rightclick = driver.findElement(By.cssSelector("#hplogo")).sendKeys(");;
		//Actions action = new Actions(driver);
		//action.contextClick(rightclick).perform();
		
	}

}
