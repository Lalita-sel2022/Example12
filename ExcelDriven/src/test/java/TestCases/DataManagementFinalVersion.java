package TestCases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalVersion {
  @Test(dataProvider = "dp")
  public void f(Hashtable<String, String> h) {
  }

  @DataProvider
  public Object[][] dp() throws IOException 
  {
	  ExcelUtility a= new ExcelUtility("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");
	  String sheetName="data";
	  String testCaseName="TestA";
	  return DataUtil.getData(a, sheetName, testCaseName);
  }
}
