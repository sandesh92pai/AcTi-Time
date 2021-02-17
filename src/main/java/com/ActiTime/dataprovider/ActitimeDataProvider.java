package com.ActiTime.dataprovider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.ActiTime.Utils.excelUtils;

public class ActitimeDataProvider {
	
	
	@DataProvider
	public Object[] getdata(Method m)
	{
		String testname = m.getName();
		List<Map<String, String>> list = excelUtils.getData("data");
		
	      List<Map<String, String>> smalllist = new ArrayList<Map<String,String>>();
	      
	      for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("testcasename").equalsIgnoreCase(testname)) {
				if (list.get(i).get("execute").equalsIgnoreCase("yes")) {
					
					smalllist.add(list.get(i));
					
				}
				
			}
		}
	      return  smalllist.toArray();
	}
   
}
