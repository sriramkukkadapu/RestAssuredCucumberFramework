package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllSheetData {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("excelData/Data.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		//int totalSheets = workBook.getNumberOfSheets();
		XSSFSheet sheet =  workBook.getSheet("testData");
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+" | ");

	        }
            System.out.println("\n-------------------------------------------");
	        //System.out.println();
	    } 
	
		
	
		workBook.close();
	}

}
