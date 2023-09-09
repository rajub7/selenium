package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFormulaCell {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\Emp.xlsx");
		
		Workbook workbook =new XSSFWorkbook(fis);
		
		Sheet sheet= workbook.getSheet("Emp data");
		
		int row=sheet.getLastRowNum();
		
		int col=sheet.getRow(0).getLastCellNum();
		
		for (int i = 0; i < row; i++) {
		Row rows=sheet.getRow(i);
			
			for (int j = 0; j < col; j++) {
			Cell cell=	rows.getCell(j);
				
				switch (cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue()+"  ");
					
					break;
					
				case NUMERIC:System.out.print(cell.getNumericCellValue()+" ");
				
				case FORMULA:System.out.print(cell.getNumericCellValue()+" ");

				default:
					break;
				}
				System.out.print("|| ");
				
			}
			System.out.println(" ");
		}
		
		workbook.close();
		
        fis.close();
	}

}
