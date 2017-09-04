package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//to verify the title
	
	public void verifyTitle(String etitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching : "+etitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching : "+etitle,true);
			Assert.fail();

		}
	}
	// to verify the element
	public void verifyElementPresent(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is matching : "+element.getText(),true);
			
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching : "+element.getText(),true);
			Assert.fail();

			
		}
		
	}
	

}
