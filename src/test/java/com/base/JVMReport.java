package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateCucumberReport(String jsonFileLoc) {
		File jvmPortLoc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
        Configuration con=new Configuration(jvmPortLoc,"RedBus");
        con.addClassifications("BrowserName", "chrome");
        //add the os info
        con.addClassifications("OS", "10");
        //sprint information
        con.addClassifications("Sprint", "16");
        con.addClassifications("Sprint", "18");
        List<String> listOFJsonFile=new ArrayList<String>();
        listOFJsonFile.add(jsonFileLoc);
        //Execute
        ReportBuilder builder=new ReportBuilder(listOFJsonFile,con);
        builder.generateReports();
	}
	
}
