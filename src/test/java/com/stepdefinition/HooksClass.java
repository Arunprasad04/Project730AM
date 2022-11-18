package com.stepdefinition;

import org.excel.BaseClass1;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class HooksClass extends BaseClass1 {

	
	@Before("@Reg")
	public void beforeScenario() {
	System.out.println("BeforeScenario");
getDriver("chrome");
url("https://www.facebook.com/");
	}
	
	@After("@Reg")
	public void afterScenario() {

System.out.println("AfterScenario");
quitBrowser();
	}
	
}
