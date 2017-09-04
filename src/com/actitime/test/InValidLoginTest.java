package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.LoginPage;

public class InValidLoginTest extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		
		//get user name
		String un=ExcelData.getData(path, "Sheet1", 2, 0);
		
		//get password
		String pw=ExcelData.getData(path, "Sheet1", 2, 1);
					
		//get Login Page Title
		String lpTitle=ExcelData.getData(path,"Sheet1", 1, 2);
					
		//get enter time track title
	    LoginPage lp=new LoginPage(driver);
					
		//verify the title is actitime-login
		lp.verifyingTitle(lpTitle);
		
		//enter invalid username
		lp.enterUserName(un);
				
		//enter invalid password
		lp.enterPassword(pw);
				
		//click on login button
		lp.clickOnLogin();
		
		//verify error msg
		lp.verifyErrorMessage(); 
				
				
	}

}
