package com.actitime.generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	//to select by index in list box
	
	public static void selectByIndex(WebElement element,int n)
	{
		Select sel=new Select(element);
		sel.selectByIndex(n);
	}
	
	//to select by value in list box
	
	public static void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	//to select by visible text in listbox
	
	public static void selectByVisibleText(WebElement element,String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	
	//to select drop down menu in actions class
	
	public static void moveToElement(WebElement element,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	// to drag and drop in actions class
	
	public static void dragAndDrop(WebElement src,WebDriver driver,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	
	//to get windowhandle and break at the selected window
	
	public static void windowHandle(WebDriver driver,String etitle)
	{
		Set<String> winhandles=driver.getWindowHandles();
		Iterator<String> itr=winhandles.iterator();
		while(itr.hasNext())
		{
			String wh=itr.next();
			driver.switchTo().window(wh);
			if(driver.getTitle().equals(etitle))
			{
				break;
			}
		}
	}	
	

}
