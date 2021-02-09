package com.ActiTime.Constants;

public class FrameWorkConstants {
	
	private FrameWorkConstants() {};
	
	private final static String CONFIGFILEPATH = System.getProperty("user.dir") +
			                                   "/src/main/resources/com/ActiTime/ConfigProperties/configProperties";

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}


}
