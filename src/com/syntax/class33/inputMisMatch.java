package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class inputMisMatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/configs/configuration.propertie";
		
		try {
			
			FileInputStream fis=new FileInputStream(file);// new FileNotFoundException();
			fis.close();
			Properties prop=new Properties();
			prop.load(fis);//new IOException();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 

		System.out.println(" --- END OF THE PROGRAM ----------");
	}
}