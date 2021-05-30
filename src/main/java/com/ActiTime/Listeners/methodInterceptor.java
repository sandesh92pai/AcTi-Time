package com.ActiTime.Listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.ActiTime.Utils.excelUtils;

public class methodInterceptor implements IMethodInterceptor{

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
	
		List<Map<String, String>> list = excelUtils.getData("runner");
		System.out.println(" list size (minter) is " + list.size());
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();

		for(int i=0;i<methods.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("testcasename")) &&
					list.get(j).get("enabled").equalsIgnoreCase("yes")) {
					
					//methods.get(i).getMethod().setDescription((list.get(j).get("testdescription")));
						//methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("count")));
						//methods.get(i).getMethod().setPriority(Integer.parseInt(list.get(j).get("priority")));
					
						result.add(methods.get(i));
					}
				
			}
		}
		System.out.println(" result size is " + result.size());
		return result;
	}
}
