package excelReaderOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByColumnName {
	
	public static void main(String[] args) throws IOException{

		FileInputStream fil = new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(fil);
		XSSFSheet sheetName = workBook.getSheet("login");
		XSSFRow row = sheetName.getRow(0);
		/*
		 * XSSFCell cell = null;
		 * 
		 * int cellIndex = 0;
		 * //System.out.println("row.getLastCellNum()  "+row.getLastCellNum()); for(int
		 * i=0;i<row.getLastCellNum();i++) {
		 * //System.out.println("row.getCell(i).getStringCellValue().trim().  "+row.
		 * getCell(i).getStringCellValue().trim());
		 * if(row.getCell(i).getStringCellValue().trim().equals("DateCreated")) {
		 * cellIndex=i; } }
		 * 
		 * System.out.println("Cell index is :"+cellIndex);
		 * 
		 * Date date=null; row=sheetName.getRow(3); cell = row.getCell(cellIndex); date
		 * = cell.getDateCellValue(); System.out.println("Cell value is :"+date);
		 * 
		 * workBook.close(); fil.close();
		 */
		
		XSSFCell cell = null;
		int cellIndex=0;
		
		for(int i =0; i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("DateCreated"))
			cellIndex = i;
		}
		
		System.out.println("Cell Index is :: "+cellIndex);
		
		row = sheetName.getRow(2);
		cell = row.getCell(cellIndex);
		
		System.out.println("Cell value is "+cell);
	
		
		if (HSSFDateUtil.isCellDateFormatted(cell)) {
			DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
			Date date = cell.getDateCellValue();
			String cellValue = dt.format(date);
		
		//DateTimeFormatter dt = DateTimeFormatter.ofPattern( "uuuu-MM-dd");

		//System.out.println("<" + LocalDate.parse(cell.toString()).format(dt) + ">");
		//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(cell); 
		System.out.println("Cell value is :: "+cellValue);
		workBook.close();
		fil.close();
		
		
		}
		
	}
}




