package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriteToExcel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream op;
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("login");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(4);
		cell.setCellValue("Pass");
		op = new FileOutputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		book.write(op);
		
		book.close();
		file.close();
		

	}

}
