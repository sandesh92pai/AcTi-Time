package com.ActiTime.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.ConfigFileReader;
import com.ActiTime.pom.login;

public class Demo {
	
	
	
	@Test
	public void test()
	{
		
		String name = "February 2021";
		String mon = "2060";
		String[] names = name.split(" ");
	   String month = names[1];
	   System.out.println(names[1]);
	   System.out.println(month.compareTo(mon));
	   System.out.println(mon.compareTo(month));
	  int value = mon.compareTo(month);
	  
	  if(value == + 1 || value == +2 || value == +4)
	  {
		System.out.println("decrease");
	  }
	  else if(value ==  - 1 || value == - 2 || value == - 4)
	  {
		 System.out.println("increase");
	  }
	  else if (value == 0)
	  {
		 System.out.println("click on that");
	  }
	  else if (value == -2)
	  {
		  System.out.println("out od sys");
	  }
	}
}



