package com.ActiTime.Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import com.ActiTime.dataprovider.ActitimeDataProvider;

public class NaukriAnnotationTransformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {

		annotation.setDataProviderClass(ActitimeDataProvider.class);
		annotation.setDataProvider("getdata");
		
	}
	
	
	
	
}
