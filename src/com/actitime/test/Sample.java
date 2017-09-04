package com.actitime.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;

@Listeners(com.actitime.generic.ListenersTest.class)
public class Sample extends BaseTest
{
	@Test(enabled=false)
	public void m()
	{
	  Assert.fail();	
	}
}
