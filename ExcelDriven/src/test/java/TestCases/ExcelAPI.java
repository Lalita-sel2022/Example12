package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPI {
	public FileInputStream fil;
	public FileOutputStream op;
	public XSSFWorkbook book;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String filePath;
	int rows=0;

	public ExcelAPI(String filePath) throws IOException {
		System.out.println("Excel has initilized......");
		this.filePath = filePath;
		fil = new FileInputStream(filePath);
		book = new XSSFWorkbook(fil);
	}

	public int getRowCount(String sheetName) {
		sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}

	public int getColCount(String sheetName) {
		sheet = book.getSheet(sheetName);
		row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		return colCount;
	}

	// Reading cell data from Excel by using Column Number
	public String getCellData(String sheetName, int colNum, int rowNum) {
		sheet = book.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		System.out.println("Cell is : "+cell);
		
	
//        while(row.getCell(colNum)!=null)
//        {
//        	colNum++;
//        	
//        }
//        System.out.println("Col count is : "+colNum);
	
		try {
			if (cell.getCellTypeEnum() == CellType.STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
					Date date = cell.getDateCellValue();
					cellValue = dt.format(date);
				}
				return cellValue;
			} else if (cell.getCellTypeEnum() == CellType.BLANK) {
				return "";
			} else {

				return String.valueOf(cell.getBooleanCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "No matching value";
		}
	}

	// Reading cell data from Excel by using Column Name
	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			int colNum = 0;
			sheet = book.getSheet(sheetName);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				row.getCell(i).getStringCellValue().equals(colName);
				colNum = i;
			}

			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			if (cell.getCellTypeEnum() == CellType.STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {
				String cellValue = String.valueOf(cell.getDateCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
					String date = cell.getErrorCellString();
					cellValue = dt.format(date);
				}

				return cellValue;
			} else if (cell.getCellTypeEnum() == CellType.BLANK) {
				return "";
			} else {
				return String.valueOf(cell.getBooleanCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "No matching value";
		}

	}

	// Writing cell data to Excel by using Column Number
	public boolean setCellData(String sheetName, int colNum, int rowNum, String value) throws IOException {
		try {
			sheet = book.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			cell.setCellValue(value);
			op = new FileOutputStream(filePath);
			book.write(op);
			op.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	// Writing cell data to Excel by using Column Name
	public boolean setCellData(String sheetName, String colName, int rowNum, String value) throws IOException {
		try {
			int colNum = -1;
			sheet = book.getSheet(sheetName);
			row = sheet.getRow(rowNum);

			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().equals(colName))
					;
				colNum = i;
			}

			row = sheet.getRow(rowNum + 1);
			cell = row.getCell(colNum);
			cell.setCellValue(value);
			op = new FileOutputStream(filePath);
			book.write(op);
			op.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
}
