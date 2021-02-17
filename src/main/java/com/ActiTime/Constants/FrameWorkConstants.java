package com.ActiTime.Constants;

public class FrameWorkConstants {
	
	private FrameWorkConstants() {};
	
	private final static String CONFIGFILEPATH = System.getProperty("user.dir") +
			                                   "/src/main/resources/com/ActiTime/ConfigProperties/configProperties";

	
	
	
	private final static String EXCELPATH = System.getProperty("user.dir") +
            "/src/main/resources/excel/actitimetestdata.xlsx";
			
			
	
	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}



	public static String getExcelpath() {
		return EXCELPATH;
	}


}
