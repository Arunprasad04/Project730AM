package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperation {
public static void main(String[] args) throws IOException {
//	File f=new File("C:\\Add");
//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
	//Multifolder
//	File f=new File("C:\\Add\\Excel\\Excel1");
//	boolean mkdir = f.mkdirs();
//	System.out.println(mkdir);
//	//Pgm for create file
//	File f=new File("C:\\Add\\Excel\\Excel1\\wednesday.txt");
//	boolean createNewFile = f.createNewFile();
//	System.out.println(createNewFile);
	//Shows all files in folder
//	File f2=new File("C:\\Add\\Excel\\Excel1\\wednesday2.txt");
//	boolean createNewFile = f2.createNewFile();
//	File f1=new File("C:\\Add\\Excel\\Excel1");
//	String[] list = f1.list();
//	for(String l:list) {
//		System.out.println(l);
	//Pgm for viewing path
//	File f=new File("C:\\Add\\Excel\\Excel1");
//	File[] listFiles = f.listFiles();
//	for(File file:listFiles) {
//		System.out.println(file);
//	}
	//Pgm for write a data in files
	//Creating a file
//	File f=new File("C:\\Add\\excel.txt");
//	f.createNewFile();
//	FileUtils.write(f, "Java is a programming language");
	//To read the data
	File f=new File("C:\\Add\\excel.txt");
	String readFileToString = FileUtils.readFileToString(f);
	System.out.println(readFileToString);
	//Copy a file
	File f1=new File("C:\\Add\\Excel\\Excel1\\wednesday.txt");
	FileUtils.copyFile(f, f1);
	String readFileToString2 = FileUtils.readFileToString(f1);
	System.out.println(readFileToString2);
	}
}

