package TestCases;

import java.io.IOException;

public class UtilClassPractice {

	public static void main(String[] args) throws IOException 
	{
		String sheetName="login";
		ExcelUtility a= new ExcelUtility("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		int rowCount=a.getRowCount(sheetName);
		System.out.println("Rows count is : "+rowCount);
		
		System.out.println("Column count is : "+a.getColCount(sheetName));
		
		String value = a.getCellData(sheetName, 1, 1);
		System.out.println("Cell value is :"+value);
		
		int col=0;
		while(!a.getCellData(sheetName, col, 0).equals(""))
		{
			col++;
			System.out.println("Cols is :"+col);
		}
		
		System.out.println("Total Cols is :"+col);
		
		int rows=0;
		while(!a.getCellData(sheetName, 0, rows).equals(""))
		{
			rows++;
			System.out.println("Rows is :"+rows);
		}
		
		System.out.println("Total Cols is :"+rows);

	}

}
