package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

				try {
			File fi= new File("C:\\Users\\admin\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		 FileInputStream fis =new FileInputStream(fi);
           Workbook workbook= new XSSFWorkbook(fis);
          Sheet sheet= workbook.getSheetAt(0);
		 int r= sheet.getLastRowNum();
		 
		 int c=sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<=r;i++) {
			Row rows= sheet.getRow(i);
			for (int j = 0; j <c; j++) {
			Cell cell=	rows.getCell(j);
			
			switch (cell.getCellType()) {
		    case STRING:System.out.print(cell.getStringCellValue()+"  ");
				break;
				
			case NUMERIC:System.out.print(cell.getNumericCellValue()+"  ");
			break;
	       
			case BOOLEAN:System.out.print(cell.getBooleanCellValue()+"  ");
			break;


			default:System.out.println(" null pointer");
				break;
			}  
			}
			 
			System.out.println(" ");
		 }
		 
		   workbook.close();
		   fis.close();
			 
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
