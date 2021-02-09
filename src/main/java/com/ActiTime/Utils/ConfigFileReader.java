package com.ActiTime.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.ActiTime.Constants.FrameWorkConstants;
import com.ActiTime.Enums.FrameWorkEnums;

public final class ConfigFileReader {
	
	private ConfigFileReader() {};
	private static Properties property = new Properties();
	private static FileInputStream file;
	
	
	
	public static String getdata(FrameWorkEnums key)
	{
		try {
			file = new FileInputStream(FrameWorkConstants.getConfigfilepath());
			property.load(file);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return property.getProperty(key.toString().toLowerCase());
		
	}

}
