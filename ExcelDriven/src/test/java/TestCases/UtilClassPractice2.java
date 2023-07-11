package TestCases;

import java.io.IOException;

public class UtilClassPractice2 {

	public static void main(String[] args) throws IOException 
	{
		String sheetName="data";
		String testCaseName="TestA";
		ExcelUtility a= new ExcelUtility("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
		
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
		
		for(int row=dataStartRowCount;row<dataStartRowCount+rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				System.out.println(a.getCellData(sheetName, col, row));
			}
		}

	}

}
