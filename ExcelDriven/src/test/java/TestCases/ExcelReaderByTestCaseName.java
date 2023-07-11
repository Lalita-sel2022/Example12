package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByTestCaseName {

	public static void main(String[] args) throws Exception
	{
		String sheetName = "data";
		
		ExcelAPI e= new ExcelAPI("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
		System.out.println(e.getRowCount(sheetName));
		//System.out.println(e.getColCount(sheetName));
		System.out.println(e.getCellData(sheetName, 1, 2));
		
	}

}
