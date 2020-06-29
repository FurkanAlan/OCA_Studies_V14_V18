package com.syntax.class31;
//Shortcat for import for windows control+shift//mac comand +shift +o
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main (String[]args) throws IOException {
		//to read the file
		//1.have file 
		String filepath="/Users/aydin/eclipse-workspace/JavaBatch6/configs/Examples.properties";
//2 bring object of FileInputStream 
		FileInputStream fileInput=new FileInputStream(filepath);
		//to handle data from properties file we need property class
	Properties prop1	=new Properties();
   prop1.load(fileInput);
	String name= prop1.getProperty("name");
	System.out.println(name);
	String city=prop1.getProperty("city");
	//getting all keys from property file
	Set<Object>keys=prop1.keySet();
	for(Object key:keys) {
		System.out.println(key);
	}
	
		
		
}

	private static void getProperty(String string) {

		
	}

	
}

