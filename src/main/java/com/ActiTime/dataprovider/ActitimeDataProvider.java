package com.ActiTime.dataprovider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.ActiTime.Utils.excelUtils;

public class ActitimeDataProvider {
	
	private static List<Map<String, String>> list =	new ArrayList<Map<String, String>>();
	
	@DataProvider(parallel=true)
	public static Object[] getdata(Method m) {
		
		String testname = m.getName();
		
		if(list.isEmpty()) {
			list = excelUtils.getData("Sheet2");
		}
		
		System.out.println(list.size() + " full list size");
		List<Map<String, String>> smalllist = new ArrayList<Map<String, String>>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).get("testcasename").equalsIgnoreCase(testname) &&  
					list.get(i).get("execute").equalsIgnoreCase("yes")) {
						smalllist.add(list.get(i));
			}
		}
		System.out.println(smalllist.size() + " smalllist list size");
		return smalllist.toArray();
		
	}	

}
