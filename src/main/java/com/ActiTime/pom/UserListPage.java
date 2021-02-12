package com.ActiTime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.Driver.DriverManager;
import com.ActiTime.Enums.FrameWorkEnums;
import com.ActiTime.Utils.DynamicXpath;

public class UserListPage extends BasePom {


	private final static By userList = By.xpath("//div[.='USERS']/..");
	private final static By adduserbutton = By.xpath("(//div[.='Add User'])[2]");
	private final static By permissionText = By.xpath("//span[.='Permissions']");
	private final static By firstnametextbox = By.xpath("//input[@name='firstName' and @placeholder = 'First Name']");

	String firstnamexpath = "//input[@name='%s' and @placeholder = '%s']";

	@FindBy(xpath ="//input[@name='firstName' and @placeholder = 'First Name']")
	private WebElement firstnametext;
	public UserListPage()
	{
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	private final static By middlenametextbox = By.xpath("//input[@name='middleName' and @placeholder = 'MI']");
	private final static By lastnametextbox = By.xpath("//input[@name='lastName' and @placeholder = 'Last Name']");
	private final static By emailtextbox = By.xpath("//input[@name='email' and @placeholder = 'Email']");
	private final static By username = By.xpath("//input[@name='username' and @placeholder = 'Username']");
	private final static By passwordtextbox = By.id("userDataLightBox_passwordField");
    private final static By retrypassword = By.id("userDataLightBox_passwordCopyField");
	private final static By timezonedropdown = By.xpath("//div[@id='userDataLightBox_timeZoneGroupValueCell']");
	private final static By selectoffice =By.xpath("(//div[.='Sydney Office'])[5]");
	private final static By createuserbtn = By.xpath("//span[.='Create User']");
    private final static By searchUserTextBox = By.xpath("//input[@placeholder='Start typing name']");


	public UserListPage userList()
	{
		click(userList, FrameWorkEnums.elementisclickable, "userList button clicked");
		return this;
	}    


	public UserListPage adduser()
	{
		click(adduserbutton, FrameWorkEnums.elementisclickable, "adduser button clicked");
		return this;
	} 



	public UserListPage enterFirstname(String value)
	{
		enterInput(firstnametextbox, FrameWorkEnums.presenceofElement, value, "firstname field");
		return this;
	}


	public UserListPage entermiddlename(String value)
	{
		enterInput(middlenametextbox, FrameWorkEnums.presenceofElement, value, "middlename field");
		return this;
	}

	public UserListPage enterlastname(String value)
	{
		enterInput(lastnametextbox, FrameWorkEnums.presenceofElement, value, "lastname field");
		return this;
	}

	public UserListPage enteremail(String value)
	{
		enterInput(emailtextbox, FrameWorkEnums.presenceofElement, value, "mail field");
		return this;
	}

	
	public UserListPage username(String value)
	{
		enterInput(username, FrameWorkEnums.presenceofElement, value, "username field");
		return this;
	}
	
	
	public UserListPage password(String value)
	{
		enterInput(passwordtextbox, FrameWorkEnums.presenceofElement, value, "password field");
		return this;
	}

	
	public UserListPage retrypassword(String value)
	{
		enterInput(retrypassword, FrameWorkEnums.presenceofElement, value, "retRypassword field");
		return this;
	}

	

	public UserListPage clickTimeZone()
	{
		click(timezonedropdown, FrameWorkEnums.none, "timezone clicked");
		return this;
	}

	public UserListPage selectOfficeZone()
	{
		click(selectoffice, FrameWorkEnums.elementisclickable, "office zone selected");
		return this;
	}

	public UserListPage scrollTo()
	{
		scrollTo(permissionText, FrameWorkEnums.presenceofElement,"permissionTextVisible");
		return this;
	}

	public HomePage clickCreateUSer()
	{
		click(createuserbtn, FrameWorkEnums.elementisclickable, "create user button");
		return new HomePage();
	}
	
	public UserListPage searchuser(String value)
	{
		enterInput(searchUserTextBox, FrameWorkEnums.presenceofElement, value, "search field");
		return this;
	}
	
	public void entertextinTextbox(String replace1, String replace2, String passelementname, String passInput)
	{
		String newxpath = DynamicXpath.getXpath(firstnamexpath, replace1, replace2);
		enterInput(By.xpath(newxpath), FrameWorkEnums.presenceofElement, passInput, passelementname);
		
	}






}
