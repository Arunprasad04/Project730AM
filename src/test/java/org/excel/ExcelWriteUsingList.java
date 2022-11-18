package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUsingList {
public static void main(String[] args) throws IOException {
	List<String> li=new LinkedList<String>();
	li.add("Java");
	li.add("Maven");
	File f=new File("C:\\Excel\\Excel1.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet createSheet = w.createSheet("LoginDetails");
	for(int i=0;i<li.size();i++) {
		createSheet.createRow(i).createCell(0).setCellValue(li.get(i));
		FileOutputStream out=new FileOutputStream(f);
		w.write(out);
	}
}
}
