package com.ActiTime.TestCases;

import java.util.Map;

import org.testng.annotations.Test;
import com.ActiTime.pom.login;
import com.ActiTime.Enums.CategoryType;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.annotation.FrameWorkAnnotation;
import com.ActiTime.pom.LicensePomPage;

public class Licenses extends BaseTestPage{
	
	
	@FrameWorkAnnotation(author = { "sandesh" }, category = {CategoryType.SMOKE})
	@Test
	public void Print_no_of_product_date_users_text(Map<String, String>map)
	{

		login lg = new login();
		lg.username(map.get("username")).password(map.get("loginpassword"))
		.loginClick().pause(3000);

		LicensePomPage li = lg.settingBtnclick().licenseBtnBtnclick();
	       li.LicensePage();
	       
	}

}
