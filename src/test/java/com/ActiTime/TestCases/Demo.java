package com.ActiTime.TestCases;

import org.testng.annotations.Test;

import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.ConfigFileReader;

public class Demo {
	
	
	
	@Test
	public void test()
	{
		System.out.println(ConfigFileReader.getdata(FrameWorkEnums.url));
	}

}
