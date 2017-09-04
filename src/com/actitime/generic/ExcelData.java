package com.actitime.generic;

import java.io.File;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	//to get the data from the excel sheet
	
	public static String getData(String path,String sheet,int rn,int cn)
	{
		try
		{
		    File file=new File(path);
			String data=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).getStringCellValue();
			return data;
	    }
		catch(Exception e)
		{
			return "";
		}
	}
	//to get rowcount
	
	public static int getRowCount(String path,String sheet)
	{
		try
		{
		    File file=new File(path);
			int rn=WorkbookFactory.create(file).getSheet(sheet).getLastRowNum();
			return rn;
	    }
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//to get cell count
	
	public static short getCellCount(String path,String sheet,int rn)
	{
		try
		{
		    File file=new File(path);
			short cn=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getLastCellNum();
			return cn;
	    }
		catch(Exception e)
		{
			return 0;
		}
	}
	
	
	
	
	
	

}
