package com.Datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			
		Workbook workbook=new XSSFWorkbook();
		
		Sheet sheet= workbook.createSheet("Emp data");
		
		
		Object[][] empdata={{"empname","salary","id"} , {"raju" ,"125000","26935"} ,  {"ambhika" ,"50000","58258"},
				{"charran" ,"250000","18250"} ,{"tony" ,"25000","56251"} };
		
		int row=empdata.length;
		int col= empdata[0].length;
		
		System.out.println(row);
		System.out.println(col);
		
		for (int i = 0; i <row; i++) { 
			Row rows=sheet.createRow(i);
			for (int j = 0; j <col; j++) {
			Cell cell=	rows.createCell(j);
			  Object value= empdata[i][j];
			  if(value instanceof String )
				  cell.setCellValue((String)value);
			  if(value instanceof Integer)
				  cell.setCellValue((Integer)value);
			}
			
		}	
	File file=new File("C:\\\\Users\\\\admin\\\\Desktop\\\\Emp.xlsx");
		
		FileOutputStream fos=new FileOutputStream(file);

		workbook.write(fos);
		
		fos.close();
		
		System.out.println("succesfully write");
	}

}
