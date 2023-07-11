package TestCases;

import org.testng.annotations.Test;

import com.google.common.collect.HashBasedTable;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "getData")
  //how many arguments you passint that prameters need to received here 
  //Can overcome this issue using hashTable becoze hashTable has one column only
  //public void f(String RunMode, String Browser,String UserName,String UserPassword,String ExpectedResult) 
  public void f(Hashtable<String, String> h){
  }

  @DataProvider
  public Object[][] getData() throws IOException 
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
