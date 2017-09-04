package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest implements AutoConstant
{
	public static WebDriver driver=null;
	@BeforeMethod
	public void preConditions()
	{
		System.setProperty(CHROME_Key,CHROME_Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	
	}
	@AfterMethod
	public void postConditions()
	{
		driver.close();
	}
}



