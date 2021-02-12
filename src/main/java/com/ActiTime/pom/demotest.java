package com.ActiTime.pom;

import java.util.Map;

import org.testng.annotations.Test;

import com.ActiTime.Utils.DynamicXpath;
import com.ActiTime.dataprovider.ActitimeDataProvider;

public class demotest {

	
	
	
	
	@Test(dataProvider = "getdata", dataProviderClass = ActitimeDataProvider.class)
	public void test(Map<String, String>map)
	{
		String firstnamexpath = "//input[@name='%s' and @placeholder = '%s']";
		System.out.println(DynamicXpath.getXpath(firstnamexpath, map.get("replace1"), map.get("replace2")));
		System.out.println(map.get("placeholder")) ;
	}
}
