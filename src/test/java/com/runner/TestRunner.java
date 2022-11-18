package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\91959\\eclipse-workspace\\Project730AMBatch\\src\\test\\resources\\LoginPage.feature"},glue= {"com.stepdefinition"}, monochrome=true
, plugin= {"json:src\\test\\resources\\Reports\\login.json"})
//Features-->path of the feature file
//glue-->Path of the step definition
public class TestRunner {
@AfterClass	
public static void afterClass() {
	JVMReport.generateCucumberReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\login.json");
}

}
