package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {

	
		
		FileInputStream fil= new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
	    XSSFWorkbook book = new XSSFWorkbook(fil);
		XSSFSheet sheet = book.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cellValue = row.getCell(1);
		System.out.println("Cell value is :"+cellValue);
		
		book.close();
		fil.close();

	}

}
