package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WriteToExcel {

	public static void main(String[] args) {
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		try {
			FileInputStream fis =new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
