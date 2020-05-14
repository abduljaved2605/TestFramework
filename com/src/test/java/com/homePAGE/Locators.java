package com.homePAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	static WebDriver driver =  TestBase.driver();

	
	public   String Email = "inputEmail";
	//"inputPassword"
	public   String Password = "inputPassword";
	//SignInButon
	public   String SignInButon = "/html/body/div/div[1]/div/form/button";
	public String ListOfValues = "/html/body/div/div[2]/div/ul/li";
	public int totalNumberofList = 3;
	
	//)
	public String BadgeValue = "/html/body/div/div[2]/div/ul/li[2]/span";
	
	public String numericValueofBadge = "6";
	
	//"
	public String DropDownButton = "//*[@id=\"dropdownMenuButton\"]";
	//"/html/body/div/div[3]/div/div/div/a"
	public String selectItem ="/html/body/div/div[3]/div/div/div/a";
	public String option_3 = "/html/body/div/div[3]/div/div/button/";
	public String First_Button = "//*[@id=\"test-4-div\"]/button[1]";
	public String Second_Button = "//*[@id=\"test-4-div\"]/button[2]";
	public Locators()
	{
		final String Password1 = "inputPassword";

	}
	
	public void printDriver()
	{
		
		WebElement butod= driver.findElement(By.xpath("//*[@id=\"test5-button\"]"));
	}
	
	public static WebElement findByID(String ll)
	{
		return driver.findElement(By.id(ll));
	}

}
