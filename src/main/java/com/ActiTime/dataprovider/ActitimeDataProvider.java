package com.ActiTime.dataprovider;

import org.testng.annotations.DataProvider;

import com.ActiTime.Utils.excelUtils;

public class ActitimeDataProvider {
	
	
	@DataProvider
	public Object[] getdata()
	{
		return excelUtils.getData("data");
	}

}
