package com.ActiTime.Utils;

import org.openqa.selenium.By;

import com.ActiTime.Driver.DriverManager;

public class CalenderUtils {
	
	
	public static void clickCaleneder(String date, String year)
	{
	String Year = year;
	           String[] arr = Year.split(" ");
	           String month = arr[0];
	           String years = arr[1];
	String day = date;
	String decmonth = "December";
	String janmonth = "January";
	
	
	
	while(true)
	{
		String Actualmonth = DriverManager.getDriver().findElement(By.xpath("//a[@title='Previous Month (Control+Left)']/../following-sibling::td/table")).getText().trim();
		String ActualmonthArray[] = Actualmonth.split(" ");
		String ActualmonthCaptured = ActualmonthArray[0];
		System.out.println(ActualmonthCaptured);
		String ActualyearCaptured = ActualmonthArray[1];
		System.out.println(ActualyearCaptured);
		System.out.println(years.compareTo(ActualyearCaptured));
		
		int difference = years.compareTo(ActualyearCaptured);
		
		if (difference == + 1 || difference == +2 || difference == +4 || difference == +5 || difference== +3){
			DriverManager.getDriver().findElement(By.xpath("//a[@title = 'Next Month (Control+Right)']")).click();
			
		}
		else if(difference == - 1 || difference == -2 || difference == -4 || difference == -5 || difference == -3)
		{
			DriverManager.getDriver().findElement(By.xpath("//a[@title = 'Previous Month (Control+Left)']")).click();
		}
		
		else if(difference == 0)
		{
			if (ActualmonthCaptured.equalsIgnoreCase(decmonth)) {
				while(true)
				{
					String text =  DriverManager.getDriver().findElement(By.xpath("//a[@title='Previous Month (Control+Left)']/../following-sibling::td/table")).getText().trim();
					if(text.equals(Year))
					{
						break;
					}
					else
					{
						DriverManager.getDriver().findElement(By.xpath("//a[@title = 'Previous Month (Control+Left)']")).click();
					}
				}
				
			}
			
			 if (ActualmonthCaptured.equalsIgnoreCase(janmonth)) {
					while(true)
					{
						String text =  DriverManager.getDriver().findElement(By.xpath("//a[@title='Previous Month (Control+Left)']/../following-sibling::td/table")).getText().trim();
						if(text.equals(Year))
						{
							break;
						}
						else
						{
							DriverManager.getDriver().findElement(By.xpath("//a[@title = 'Next Month (Control+Right)']")).click();
						}
						}
					}
				
			 break;	
			}
				
			}
	DriverManager.getDriver().findElement(By.xpath("//span[.="+day+"]")).click();
	

}
}
