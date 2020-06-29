package com.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String filePath=projectPath+"/extra/demo.properties";
		System.out.println(filePath);
		FileInputStream files=new FileInputStream(filePath);
		Properties prop=new Properties();
		
		prop.load(files);
		
		System.out.println(prop);
		
		
		String lastName=(String)prop.get("lastName");
		String lastname=prop.getProperty("lastName");
		
		System.out.println("lastname"+lastName);
		int age2=(int)prop.get("age");
		
		//lets write back into the properties file 
		FileOutputStream files1=new FileOutputStream(filePath);
		
		
		
		

	}

}
