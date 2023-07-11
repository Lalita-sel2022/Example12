package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	public FileInputStream fil;
	public FileOutputStream op;
	public XSSFWorkbook book;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String filePath=null;
	
	public ExcelUtility(String filePath) throws IOException
	{
		this.filePath=filePath;
		fil= new FileInputStream(filePath);
		book= new XSSFWorkbook(fil);
	}
	
	public int getRowCount(String sheetName) throws IOException 
	{
		sheet=book.getSheet(sheetName);
		int rowCunt=sheet.getLastRowNum();
		
		book.close();
		fil.close();
		return rowCunt;
	}
	
	public int getColCount(String sheetName) throws IOException
	{
		//System.out.println("Sheet name is : "+sheetName);
		sheet=book.getSheet(sheetName);
		row=sheet.getRow(0);
		int cellCount=row.getLastCellNum();
		book.close();
		fil.close();
		return cellCount;
	}
	
	
	public String getCellData(String sheetName, int colNum, int rowNum) throws IOException
	{
	
		sheet=book.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		
		DataFormatter df= new DataFormatter();
		String data;
		try {
		data = df.formatCellValue(cell);// returns the formatted value of a cell as a String regaerdless of the cell Type
		}catch (Exception e) 
		{
			data="";
		}
		book.close();
		fil.close();
		return data;
		
	}
	
	public void setCellData(String sheetName, int colNum, int rowNum, String value) throws IOException
	{
		
		//System.out.println(" path :  "+filePath);
		
		sheet=book.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		
		//System.out.println("row is : "+row);
		System.out.println("Cell is : "+cell);
		cell.setCellValue(value);
		try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
		book.write(fileOutputStream);
		
		
		
		}catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		System.out.println("END OF WRITING DATA IN EXCEL");
		
		
		
	}

}
