package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

;

public class WriteDataCell {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{ 
			
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\Emp.xlsx");
			
			Workbook workbook =new XSSFWorkbook(fis);
			
			Sheet sheet= workbook.getSheet("Emp data");
		
		
		
		
		for (int i = 1; i <sheet.getLastRowNum()+1; i++) {
			Row r=sheet.getRow(i);
			
			if(r==null) {
				r=sheet.createRow(i);
			}
		Cell cell=r.createCell(r.getLastCellNum());
		int s=r.getLastCellNum()+1;
		
		cell.setCellValue("PASS");
		}
		
		System.out.println("written");
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\admin\\Desktop\\Emp.xlsx");
		
		workbook.write(fos);
		fos.close();
		
		fis.close();
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		

	}

}
