package excelReaderOperation;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataMgmtFinalVersion {
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> hs) {
  }

  @DataProvider
  public Object[][] getData() throws IOException 
  {
	  ExcelApi e= new ExcelApi("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
      String sheetName = "data";
      String testCaseName = "TestA";
      return DataUtils.getTestData(e, sheetName, testCaseName);
    		
   }
}
