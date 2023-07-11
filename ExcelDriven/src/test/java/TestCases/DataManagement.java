package TestCases;

public class DataManagement {

	public static void main(String[] args) throws Exception {
		String sheetName = "data";
		String testCaseName = "TestA";
		int testStartRowNum = 0;
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\Suite1.xlsx");

		while (!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName)) {
			testStartRowNum++;
		}
		System.out.println("Test case start from : " + testStartRowNum);

		int colStartRowcount = testStartRowNum + 1;
		int dataStartRowCount = testStartRowNum + 2;

		System.out.println("Column start from : " + colStartRowcount);

		// Calculate rows count of data
//		int row = 0;
//		
//       while (!e.getCellData(sheetName, 0, dataStartRowCount + row).equals("")) 
//       {
//       row++; 
//       }
//		 
//		System.out.println("Data row is : " + row);

		// Calculate cols count of data

		
		  int cols = 0;
//		  System.out.println("sheetName  "+sheetName);
//		  System.out.println("cols  "+cols);
//		  System.out.println("colStartRowcount  "+colStartRowcount);
//		  
//		 int colCoun = e.getColCount(sheetName,colStartRowcount);
//	     System.out.println("Column count is : " + colCoun);
		  
		  while(!e.getCellData(sheetName, cols, colStartRowcount).equals(""))
		  {
		
			  cols++;
			  System.out.println("total cols is :"+cols);
		  }
		  System.out.println("total cols is :"+cols);
//	     else {
//		 System.out.println("Not found cols");
//		
//	}
		  
		   
		 }
}



