package com.pof;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resource.DataDriven;

public class DataDriven2 {

	public ArrayList<String> datadriven() throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("E:\\kaaspro.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int num = workbook.getNumberOfSheets();

		for (int i = 0; i < num; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("login")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.rowIterator();
				row.next();
				row.next();
				Row second = row.next();
				Iterator<Cell> c = second.cellIterator();
				while (c.hasNext()) {
					Cell value = c.next();
					if(value.getCellType()==CellType.STRING)
					{

					a.add(value.getStringCellValue());
				
					}
					else{

					a.add(NumberToTextConverter.toText(value.getNumericCellValue()));
			
					}

				}

			}
		}
		return a;

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			DataDriven2 j= new DataDriven2();
			ArrayList	data=j.datadriven();
		System.out.println(data.get(0));	
		System.out.println(data.get(1));
		System.out.println(data.get(2));
			
			

		}


}
