//package com.syntax.class32;
//
//import java.io.FileInputStream;
//
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//public class ReadExcel {
//
//	public static void main(String[] args) {
//		String filePath" ";
//		String filePath=System.getProperty("user.dir")+"testdata/Test.xlsx";
//
//		FileInputStream fis =new FileInputStream(filePath);
//
//		//get anobject of workbook type
//		Workbook book =new  XSSFWorkbook (fis);
//		Sheet sheet=book .getSheet("Sheet1");
//		//need to find numbers or rows
//		int colls=sheet.getRow(0).getLastCellNum();
//		//get data from all rows and all colums
//		for (int r=0;r<rows;r++) {//iterator over rows
//			for (int c=0;c<cols;c++) {
//				String cellVal=sheet.getRow(r);.getCell(c).toString();
//				System.out.println(cellval);
//			}
//		}
//
//
//	}
//
//}
