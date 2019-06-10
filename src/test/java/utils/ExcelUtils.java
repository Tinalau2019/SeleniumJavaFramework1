package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String execelPath, String sheetName) {
		try {
			projectPath = System.getProperty("user.dir");
			 workbook = new XSSFWorkbook(execelPath);
			 sheet = workbook.getSheet(sheetName);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();		
		}
	}
	
	public static void main (String[] args) {
		getRownCount();	
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static int getRownCount() {	
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowCount);
					
		}catch( Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();		
		}	
             return rowCount;
	}
	
	public static int getColCount() {	
		int colCount=0;
		try {
			 colCount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns: "+colCount);
					
		}catch( Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();	
				
		}	
           return colCount;
	}
	
public static String getCellDataString(int rowNum, int colNum) {
	String cellData = null;
	try {
		 cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
		
	}
	   return cellData;
}
	
	public static void getCellDataNumber(int rowNum, int colNum) {
			try {
                double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				System.out.println(cellData);
				
			}catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
				
			}
		}
	}

