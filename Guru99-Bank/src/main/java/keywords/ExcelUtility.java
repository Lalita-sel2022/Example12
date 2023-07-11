package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static XSSFWorkbook excelWorkbook = null;
	public static XSSFSheet excelSheet;

	public static void setExcelFile(String path, String fileName) {
		try {
			// Open the excel file
			FileInputStream filePath = new FileInputStream(path);

			// Access the excel sheet data
			excelWorkbook = new XSSFWorkbook(filePath);
			excelSheet = excelWorkbook.getSheet(fileName);

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static String[][] getTestData(String tableName) {
		String[][] testData = null;

		try {
			// Handle numbers and strings
			DataFormatter formatter = new DataFormatter();
			XSSFCell[] boundaryCells = findCells(tableName);
			XSSFCell startCell = boundaryCells[0];

			XSSFCell endCell = boundaryCells[1];

			int startRow = startCell.getRowIndex() + 1;
			int endRow = endCell.getRowIndex() - 1;
			int startCol = startCell.getColumnIndex() + 1;
			int endCol = endCell.getColumnIndex() - 1;

			testData = new String[endRow - startRow + 1][endCol - startCol + 1];

			for (int i = startRow; i < endRow + 1; i++) {
				for (int j = startCol; j < endCol + 1; j++) {
					// testData[i-startRow][j-startCol] =
					// ExcelWSheet.getRow(i).getCell(j).getStringCellValue();
					Cell cell = excelSheet.getRow(i).getCell(j);
					testData[i - startRow][j - startCol] = formatter.formatCellValue(cell);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testData;
	}
	public static XSSFCell[] findCells(String tableName) {
		DataFormatter formatter = new DataFormatter();
		// Declare begin position
		String pos = "begin";
		XSSFCell[] cells = new XSSFCell[2];

		for (Row row : excelSheet) {
			for (Cell cell : row) {
				// if (tableName.equals(cell.getStringCellValue())) {
				if (tableName.equals(formatter.formatCellValue(cell))) {
					if (pos.equalsIgnoreCase("begin")) {
						// Find the begin cell, this is used for boundary cells
						cells[0] = (XSSFCell) cell;
						pos = "end";
					} else {
						// Find the end cell, this is used for boundary cells
						cells[1] = (XSSFCell) cell;
					}
				}
			}
		}
		// Return the cells array
		return cells;
	}

}
