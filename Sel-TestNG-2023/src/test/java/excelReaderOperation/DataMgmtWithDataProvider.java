
package excelReaderOperation;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataMgmtWithDataProvider {
  @Test(dataProvider = "getData")
  public void Test(String RunMode, String Browser, String UserName, String UserPassword, String ExpectedResult) {
  }

  @DataProvider
  public Object[][] getData() throws IOException 
  {
	  ExcelApi e= new ExcelApi("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
      String sheetName = "data";
      String testCaseName = "LoginTest";
      
      int testStartRowNo=0;
      
    while(!e.getCellData(sheetName, 0, testStartRowNo).equals(testCaseName))
    {
 	   testStartRowNo++;
    }
    System.out.println("Test start from "+testStartRowNo);
    
    int colStartRowCount= testStartRowNo+1;
    int dataStartRowCount =testStartRowNo+2;
    
    //Row count of data matching test case 
    //Calculate rows of data
    int rows=0;
    while(!e.getCellData(sheetName, 0, dataStartRowCount+rows).equals(""))
    {
 	   rows++;
    }
    System.out.println("total row are "+rows);
    
  //Calculate cols of data
    
    int clos = 0;
    //System.out.println(e.getCellData(sheetName, clos, colStartRowCount));
    while(!e.getCellData(sheetName, clos, colStartRowCount).equals("No matching value"))
    {
 	   //System.out.println(e.getCellData(sheetName, clos, colStartRowCount));
 	   clos++;
    }
   
      System.out.println("total cols are "+clos);
    
    //Read the test data
      int dataRow=0;
      
      Object[][] data= new Object[rows][clos];
      
      for(int rNum=dataStartRowCount;rNum<dataStartRowCount+rows;rNum++)
      {
     	 for(int cNum=0; cNum<clos;cNum++)
     	 {
     		 //System.out.println(e.getCellData(sheetName, cNum, rNum));
     		 
     		data[dataRow][cNum]=e.getCellData(sheetName, cNum, rNum);
     	 }
     	 dataRow++;
       }
	return data;
  }
}
