package com.actitime.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.EnterTimeTrackPage;
import com.actitime.page.LoginPage;


@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginTest extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		//get user name
		String un=ExcelData.getData(path, "Sheet1", 1, 0);
		
		//get password
		String pw=ExcelData.getData(path, "Sheet1", 1, 1);
		
		//get Login Page Title
		String lpTitle=ExcelData.getData(path,"Sheet1", 1, 2);
		
		//get enter time track title
		String eTitle=ExcelData.getData(path, "Sheet1", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		
		//verify the title is actitime-login
		lp.verifyingTitle(lpTitle);
		
		//enter valid username
		lp.enterUserName(un);
		
		//enter valid password
		lp.enterPassword(pw);
		
		//click on login button
		lp.clickOnLogin();
		
		//verify the title is actitime enter time track
		lp.verifyingTitle(eTitle);
		
		//click on logout
		e.clickOnLogout();
		
		//verify the title is actitime-login
		lp.verifyingTitle(lpTitle);
		
	}
	

}
