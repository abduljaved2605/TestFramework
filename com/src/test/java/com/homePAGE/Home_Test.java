package com.homePAGE;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Test {
	
	
	WebDriver driver =  TestBase.driver();
	Locators  locators = new Locators();
	
	@BeforeTest
	public void launch() throws IOException
	{
		
			driver.get("C:\\Users\\Admin\\Desktop\\Resume\\servus\\index.html");
			
			//driver.get(url1);
			//URL
	}
	

	/*Test 1 : Verify Email and password text field
	 * Send text in email and password text filed
	 * verify sign in button
	 */
	
	@Test(enabled = true)
	//@Test
	public void Test_1() throws Exception
	{	
		System.out.println(driver.getTitle());
		
		WebElement emailElement = Locators.findByID(locators.Email);
		WebElement passwordElement = findByID(locators.Password);
		WebElement signInButonElement = findByXPath(locators.SignInButon);
		
		Assert.assertTrue(emailElement.isDisplayed());
		Assert.assertTrue(passwordElement.isDisplayed());
		Assert.assertTrue(signInButonElement.isDisplayed());
		TestBase.waitForElement();
		
		emailElement.sendKeys("ServUs");
		passwordElement.sendKeys("Servus");
	
	}
	
	/*
	 * Test 2 : To verify 3 elements in the list 
	 * Not done : To verify the title  is displayed as "List item 2"
	 * To verify badge value as "6"
	 * 
	 */
	
	@Test(enabled = false)
	public void test2()
	{
		List<WebElement> listOfElements = driver.findElements(By.xpath(locators.ListOfValues));
		// Verify three values in the group
		Assert.assertEquals(listOfElements.size(), locators.totalNumberofList);
		
		//Verify the badge value
		
		String secondBadgeValue = findByXPath(locators.BadgeValue).getText();
		Assert.assertEquals(secondBadgeValue, locators.numericValueofBadge);
	
		
	}
	/*Test case 3: Option 1 is the default value
	 * Select Option 3 from drop down
	 * 
	 */
	
	
	@Test(enabled = true)
	public void test3() throws Exception
	{
		//WebElement dropDowntext = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		
		WebElement dropDownButtonToSelect = findByXPath(locators.DropDownButton);
		
		Actions action = new Actions(driver);
		action.moveToElement(dropDownButtonToSelect).click();
		action.moveToElement(dropDownButtonToSelect).build().perform();
		action.click();
	
		List<WebElement> itemSelect = driver.findElements(By.xpath(locators.ListOfValues));
			
		for(int i=1;i<itemSelect.size()+1;i++)
		{
			WebElement selectValue = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/a["+i+"]"));
			System.out.println(selectValue.getText());
			if(i ==1)
			{
				//Verify Default option is Option 1
				Assert.assertEquals(selectValue.getText(), "Option 1");
			}
			if(i==3)
			{
				//Verify Option 3 is selected
				selectValue.click();
				
			}
		}
				
	}

	/*Test 4
	 * First button is enabled
	 * Second Button is disabled
	 */
	
	@Test(enabled = true)
	
	public void test4()
	{
		WebElement butonEnanled = findByID(locators.First_Button);
		WebElement butonDisabled = findByID(locators.Second_Button);
		Assert.assertTrue(butonEnanled.isEnabled());
		Assert.assertFalse(butonDisabled.isEnabled());
	}
	
	@Test(enabled = false)
	public void test5() throws Exception
	{
		
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("window.scrollBy(0,1000)");
		genericWaitForElement(1000);
        //Thread.sleep(10000);
		WebElement butod= driver.findElement(By.xpath("//*[@id=\"test5-button\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", butod);

		WebElement alertText= driver.findElement(By.id("test5-alert"));
		String textToverify = alertText.getText();
		
		butod.isDisplayed();
		butod.click();
		
		
		Assert.assertTrue(alertText.isDisplayed());
		Assert.assertFalse(butod.isEnabled());
		//test5-alert
		
		
	}
	
	
	@Test
	public void test6() throws Exception
	{
		//TestBase.waitForElement(driver);
		
		 		
		Thread.sleep(10000);
		WebElement butod= driver.findElement(By.xpath("//*[@id=\"test5-button\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", butod);
		//*[@id="test-6-div"]/div/table/tbody/tr
		List<WebElement> rows =driver.findElements(By.xpath("/html/body/div/div[6]/div/div/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in table  "+rowCount);
		
		int value_r=2+1;
		int value_c=2+1;
		WebElement cellText = driver.findElement(By.xpath("/html/body/div/div[6]/div/div/table/tbody/tr["+ value_r+"]/td["+value_c+"]"));
		String getCellText = cellText.getText();
		System.out.println("********cell text is "+getCellText);
		
	}
	
	
	
	
	
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
	

	
	public WebElement findByXPath(String ll)
	{
		return driver.findElement(By.xpath(ll));
	}

	public void genericWaitForElement(int waitTime)
	{
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"test5-button\"]"))); //
		
	}
	public  WebElement findByID(String ll)
	{
		//return driver.findElement(By.id(ll));
		return Locators.findByID(ll);
	}
}
