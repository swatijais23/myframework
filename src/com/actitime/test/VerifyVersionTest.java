package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.page.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test
	public void testVersion()
	{
		//to get Login Page title
		String lpTitle=ExcelData.getData(path,"Sheet1", 1, 2);
		
		//get Version
		String version=ExcelData.getData(path, "sheet1", 1, 4);
		
		LoginPage lp=new LoginPage(driver);
		
		//verify the title is actitime-login
		lp.verifyingTitle(lpTitle);
	    
	    //Verify version
	    lp.verifyVersion(version);

	}
	

}
