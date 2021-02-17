package com.ActiTime.Listeners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.ActiTime.Utils.excelUtils;

public class methodInterceptor implements IMethodInterceptor{

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
	
		List<Map<String, String>> list = excelUtils.getData("runner");
		
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		
		
		for (int i = 0; i < methods.size(); i++) {
			
			for (int j = 0; j < list.size(); j++) {
				
				if (methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("testcasename"))) {
					if (list.get(j).get("execute").equalsIgnoreCase("yes")) {
						result.add(methods.get(i));
					}
					
				}
			}
			
		}
		
		
		
		
		return result;
	}

}
