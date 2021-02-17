package com.ActiTime.dataprovider;

import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import com.ActiTime.Utils.excelUtils;

public class testdata {
	
	
	@DataProvider()
	public Object[] getdata()
	{
		List<Map<String, String>> list = excelUtils.getData("data");
		return list.toArray();
	}
	
	
	
	
	

}
