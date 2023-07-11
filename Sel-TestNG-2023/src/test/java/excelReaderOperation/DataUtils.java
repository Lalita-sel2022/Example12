package excelReaderOperation;

import java.util.Hashtable;

public class DataUtils 
{
	
	public static Object[][] getTestData(ExcelApi e, String sheetName, String testCaseName )
	{
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
	      
	      Object[][] data= new Object[rows][1];
	      Hashtable<String,String> table=null;
	      
	      for(int rNum=dataStartRowCount;rNum<dataStartRowCount+rows;rNum++)
	      {
	    	  table = new Hashtable<String, String>();
	     	  for(int cNum=0; cNum<clos;cNum++)
	     	  {
	     		 //System.out.println(e.getCellData(sheetName, cNum, rNum));
	     		 //data[dataRow][cNum]=e.getCellData(sheetName, cNum, rNum);
	     		String keys = e.getCellData(sheetName, cNum, colStartRowCount);
	     		String values = e.getCellData(sheetName, cNum, rNum);
	     		table.put(keys, values);
	     	 }
	     	  data[dataRow][0]=table;
	     	 dataRow++;
	       }
		return data;
	  

		
	} 

}
