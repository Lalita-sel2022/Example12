package TestCases;

import java.io.IOException;
import java.util.Hashtable;

public class DataUtil 
{
	public static Object[][] getData(ExcelUtility a, String sheetName, String testCaseName) throws IOException
	{

		int testStartRowNo=0;
		
		while(!a.getCellData(sheetName, 0, testStartRowNo).equals(testCaseName))
		{
			testStartRowNo++;
		}
		
		System.out.println("Test Case strat from : "+testStartRowNo);
		
		int colStartRowcount = testStartRowNo + 1;
		int dataStartRowCount = testStartRowNo +2;
		
		int cols=0;
		while(!a.getCellData(sheetName, cols, colStartRowcount).equals(""))
		{
			cols++;
		}
		
		System.out.println("Cols count is : "+cols);
		
		int rows=0;
		while(!a.getCellData(sheetName, 0, dataStartRowCount+rows).equals(""))
		{
			rows++;
		}
		
		System.out.println("Rows count is : "+rows);
		
		//Reading the test data
		int dataRow=0;
		Object data[][]=new Object[rows][1];
		Hashtable<String, String> table=null;
		for(int row=dataStartRowCount;row<dataStartRowCount+rows;row++)
		{
			table= new Hashtable<String, String>();
			for(int col=0;col<cols;col++)
			{
				//System.out.println(a.getCellData(sheetName, col, row));
				//data[row-7][col]	=a.getCellData(sheetName, col, row);
				String keys = a.getCellData(sheetName, col, colStartRowcount);
				String values = a.getCellData(sheetName, col, row);
				table.put(keys, values);
			}
			data[dataRow][0]=table;
			dataRow++;
		}
		return data;
		
	}

}
