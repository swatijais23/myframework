package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	
	//declaration
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutBtn;
	
	//initialization
	
	public EnterTimeTrackPage(WebDriver driver)
	   {
		   super(driver);
		   PageFactory.initElements(driver,this);
	   }
	
	//utilization
	
	public void clickOnLogout()
	{
		logoutBtn.click();
	}
	

}
