package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertisFile {

	public static void main(String[] args) throws FileNotFoundException {
	// write into existing file and add values
		String filePath="/Users/aydin/eclipse-workspace/JavaBatch6/configs/Examples.properties";
		FileInputStream fish =new FileInputStream(filePath);
		Properties prop=new Properties();
		try {
			prop.load(fish);
		} catch (IOException e) {
			e.printStackTrace();
		}
		prop.setProperty("Phone number", "12345667");
		
		FileOutputStream fos =new FileOutputStream(filePath);
		try {
			prop.store(fos, "added additinal key");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
