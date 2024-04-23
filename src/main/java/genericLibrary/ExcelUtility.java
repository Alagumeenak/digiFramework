package genericLibrary;

import java.io.FileInputStream;
/*
 * Author
 */
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String readCellData(String SheetName,int rowNum,int cellCount) {
	 FileInputStream fis=null;
	try {
		fis = new FileInputStream(UtilityMethods.EXCEL_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		WorkbookFactory.create(fis).getSheet(SheetName).getRow(rowNum).getCell(cellCount).getStringCellValue();
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

	public static String[][] readRowData(String SheetName){
	 FileInputStream fis=null;
	try {
		fis = new FileInputStream(UtilityMethods.EXCEL_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Workbook workBook=null;
	try {
		workBook = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Sheet sheet=workBook.getSheet(SheetName);
	 int rowCount=sheet.getPhysicalNumberOfRows();
	 int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
	 System.out.println(rowCount);
	 System.out.println(cellCount);
	 String[][] data=new String[rowCount-1][cellCount];
	 for(int i=1;i<rowCount;i++) {
		 for(int j=0;j<cellCount;j++) {
			 data[i-1][j]=sheet.getRow(i).getCell(j).toString();
		 }
		 
	 }
	 return data;
 }
	public static String rdCellData(String SheetName,int rowNum,int cellCount) {
		 FileInputStream fis=null;
		try {
			fis = new FileInputStream(UtilityMethods.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			WorkbookFactory.create(fis).getSheet(SheetName).getRow(rowNum).getCell(cellCount).getStringCellValue();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static String[][] rdRowData(String SheetName){
		 FileInputStream fis=null;
		try {
			fis = new FileInputStream(UtilityMethods.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workBook=null;
		try {
			workBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=workBook.getSheet(SheetName);
		 int rowCount=sheet.getPhysicalNumberOfRows();
		 int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println(rowCount);
		 System.out.println(cellCount);
		 String[][] data=new String[rowCount-1][cellCount];
		 for(int i=1;i<rowCount;i++) {
			 for(int j=0;j<cellCount;j++) {
				 data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			 }
			 
		 }
		 return data;
	 }
}
