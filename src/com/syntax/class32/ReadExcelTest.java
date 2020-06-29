//package com.syntax.class32;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ReadExcelTest {
//
//	public static void main(String[]  args) throws IOException {
//		String filePath ="/Users/aydin/eclipse-workspace/JavaBatch6/TestData/Test.xlsx";
//
//				FileInputStream fis = new FileInputStream(filePath);//to bring the data into fileinputstream
//
//				//get an Object of Workbook type
//				Workbook book = new XSSFWorkbook(fis); //Workbook is interface so we create obj from XSSFWorkbook class
//				Sheet sheet = book.getSheet("Sheet2");
//
//			int row =sheet.getPhysicalNumberOfRows();
//
//			int cols= sheet.getRow(0).getLastCellNum();
//			//Get data from all row and cols
//			for (int r=0;r<row;r++) {
//				for(int c=0;c<cols;c++) {
//			String 	celVal=	sheet.getRow(r).getCell(c).toString();
//			System.out.print(celVal +" ");
//
//			System.out.println();
//
//
//				}
//
//
//		}
//
//}
//
//}
