package excelReaderOperation;

import java.io.IOException;

public class DataDemo
{

	public static void main(String[] args) throws IOException 
	{
		
		
		ExcelApi ex= new ExcelApi("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		
		System.out.println("Row number is :"+ex.getRowCount("login"));
		System.out.println("Column count :"+ex.columnCount("login"));
		System.out.println(ex.getCellData("login", 0, 1));
		System.out.println(ex.getCellData("login", "Password", 0));
		System.out.println("************ Write Data **************");
		
		ex.setCellData("login", 4, 1, "Pass1");
		

	}
}
