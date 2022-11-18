package com.stepdefinition;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OneDWithoutHeader {

	public static void main(String[] args) {
//		//1D without header
//		List<String> emp=new ArrayList<String>();
//		emp.add("Java");
//		emp.add("Maven");
//		emp.add("Selenium");
//		emp.add("testing");
//		String string = emp.get(1);
//		System.out.println(string);
//		//2D without header
//		List<ArrayList<String>> emp=new ArrayList<ArrayList<String>>();
//		ArrayList<String> al=new ArrayList<String>();
//		al.add("maven");
//		al.add("selenium");
//		ArrayList<String> al1=new ArrayList<String>();
//		al1.add("Testng");
//		al1.add("cucumber");
//		ArrayList<String> al2=new ArrayList<String>();
//		al2.add("Testing1");
//		al2.add("testing2");
//		emp.add(al);
//		emp.add(al1);
//		emp.add(al2);
//		ArrayList<String> arrayList = emp.get(1);
//		String String = arrayList.get(1);
//		System.out.println(String);
		//1D with header
//		Map<String, String> emp=new LinkedHashMap<String, String>();
//		emp.put("name", "bala");
//		emp.put("userName", "bala@gmail.com");
//		emp.put("password", "bala92");
//		String string = emp.get("userName");
//		System.out.println(string);
		//2D with header
		List<LinkedHashMap<String, String>> emp=new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> m=new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> m1=new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> m2=new LinkedHashMap<String, String>();
		m.put("name", "bala");
		m.put("userName", "bala@gmail.com");
		m.put("password", "bala92");
		m1.put("name", "ravi");
		m1.put("userName", "ravi@gmail.com");
		m1.put("password", "ravi92");
		m2.put("name", "ramu");
		m2.put("userName", "ramu@gmail.com");
		m2.put("password", "ramu92");
		emp.add(m);
		emp.add(m1);
		emp.add(m2);
		LinkedHashMap<String, String> l = emp.get(2);
		String string = l.get("userName");
		System.out.println(string);
		
	}
}
