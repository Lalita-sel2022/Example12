package TestCases;

import java.io.IOException;

public class UtilClassPractice3 {

	public static void main(String[] args) throws IOException {
		// System.out.println("Get sheet data");
		String sheetName = "data";
		String value="Oh ";
		ExcelUtility a = new ExcelUtility("C:\\Users\\DELL\\Documents\\Test.xlsx");
		//a.setCellData(sheetName, 2, 3, value);

		int rowCount=a.getRowCount(sheetName);
		System.out.println("Rows count is : " + rowCount);
		int colCount = a.getColCount(sheetName);
		System.out.println("Column count is : " + a.getColCount(sheetName));
		
		for(int row=1;row<=rowCount;row++)
		{
			//System.out.println("Cols"+col);
			String value1=a.getCellData(sheetName, 1, row).trim();
			int parseInt = Integer.valueOf(value1);
			if(parseInt>20) {
				a.setCellData(sheetName, 2, 3, "Good");
				System.out.println("Good ....");
			}else {
				a.setCellData(sheetName, 2, 3, "BAD");
				System.out.println("Bad ....");
				
			}
			//System.out.println("Rows"+row);
//			for(int col=0;col<=colCount;col++)
//			{
//				//System.out.println("Cols"+col);
//				String value1=a.getCellData(sheetName, col, row);
//				System.out.print(value1);
//				if(a.getCellData(sheetName, col, row).equals(""))
//				{
//				//	System.out.println("true");
//					//a.setCellData(sheetName, col, row,value );
//				}
//			
//			}
//			System.out.println();
	
			}
		
		//a.setCellData(sheetName, 1, 2, "Hello");

	}

}
