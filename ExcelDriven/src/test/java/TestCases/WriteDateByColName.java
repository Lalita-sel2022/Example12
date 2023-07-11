package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDateByColName {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream ot;
		FileInputStream fil= new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(fil);
		XSSFSheet sheet = book.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell;
		int cellIndex=0;
		
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Password"))
				cellIndex=i;	
		}
		
		System.out.println("Cell index is : "+cellIndex);
		
		row=sheet.getRow(3);
		cell=row.getCell(cellIndex);
		cell.setCellValue("password");
		
		ot = new FileOutputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		book.write(ot);
		book.close();
		fil.close();
		

	}

}
