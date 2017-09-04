package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

import org.testng.Assert;

public class LoginPage extends BasePage
{
	
	//declaration
	
   @FindBy(name="username")
   private WebElement unTB;
   
   @FindBy(name="pwd")
   private WebElement password;
   
   @FindBy(id="loginButton")
   private WebElement loginBTN;
   
   @FindBy(xpath="//span[contains(.,'invalid')]")
   private WebElement errorMsg;
   
   @FindBy(xpath="//nobr[contains(.,'actiTIME 2017.4')]")
   private WebElement actitimeVersion;
   
   //initialization
   
   public LoginPage(WebDriver driver)
   {
	   super(driver);
	   PageFactory.initElements(driver,this);
   }
   
   //utilization
   
   public void enterUserName(String un)
   {
	   unTB.sendKeys(un);
	         
   }
   public void enterPassword(String pwd)
   {
	   password.sendKeys(pwd);
   }
   public void verifyErrorMessage()
   {
	   verifyElementPresent(errorMsg);
   }
   public void verifyingTitle(String eTitle)
   {
	   verifyTitle(eTitle);
   }
   public void verifyVersion(String eVersion)
   {
	   String aVersion=actitimeVersion.getText();
	   Assert.assertEquals(eVersion, aVersion);
	   
   }
   public void clickOnLogin()
   {
	   loginBTN.click();
   }
   
   
   
   
   
}
