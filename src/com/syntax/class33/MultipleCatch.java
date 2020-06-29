package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		String file=System.getProperty("user.dir")+"/configs/confiquration.properties";
		
		try {
			
		FileInputStream fis =new FileInputStream(file);
		Properties prop =new Properties();
		prop.load(fis);
		fis.close();
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
		
	}

	}

}
