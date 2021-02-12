package com.ActiTime.Utils;

public class DynamicXpath {
	
	
	public static String getXpath(String xpath, String value)
	{
		return String.format(xpath, value);
	}
	
	public static String getXpath(String xpath, String value, String value1)
	{
		return String.format(xpath, value, value1);
	}
	
	

}
