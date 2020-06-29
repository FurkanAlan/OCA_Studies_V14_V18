package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TASK {

	public static void main(String[] args) throws IOException {
		String filePath="/Users/aydin/eclipse-workspace/JavaBatch6/configs/Configuration.properties";
		
		FileInputStream fileInput =new FileInputStream(filePath);//Make a connection
		
		Properties prop= new Properties();
		prop.load(fileInput);//come from fileinputstream
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
	}

}
