package com.ActiTime.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.ActiTime.Constants.FrameWorkConstants;


public class excelUtils {
	
	private  static FileInputStream file;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static Map<String, String>map = null;
	 public static List<Map<String,String>> list = null;
	
	
	
	
	public static List<Map<String, String>> getData(String Sheetname)
	{
	
		try {
			file = new FileInputStream(FrameWorkConstants.getExcelpath());
			try {
				workbook = new XSSFWorkbook(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = workbook.getSheet(Sheetname);
		int lastrow= sheet.getLastRowNum();
		short lastcell = sheet.getRow(0).getLastCellNum();
		//Object[] data = new Object[lastrow];
		
		map = new HashMap<String, String>();
		list = new ArrayList<Map<String,String>>();
		
	      for (int i = 0; i <lastrow; i++) {
	    	  map = new HashMap<String, String>();
	    	  for (int j = 0; j < lastcell; j++) {
	    		  
	    		  DataFormatter format = new DataFormatter();
	    		  String key = format.formatCellValue(sheet.getRow(0).getCell(j));
	    		  String value = format.formatCellValue(sheet.getRow(i+1).getCell(j));
	    		  map.put(key, value);
	    		  //data[i]= map;
			}
	    	  list.add(map);
		}
	     
	      System.out.println(" list size(1) is " + list.size());
		return list;
				
	}

}
