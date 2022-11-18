package org.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg4 extends BaseClass1 {

	@Parameters({"browser"})
	@Test
	private void tc01(String browser) {
		getDriver(browser);
		url("https://www.google.co.in/");
		WebElement searchIcon = locator("xpath","//input[@title='Search']");
		textSend(searchIcon,"Selenium");
		WebElement searchButton = locator("xpath","//div[@class='FPdoLc lJ9FBc']//center//input[@value='Google Search']");
		buttonClick(searchButton);
	}
}

