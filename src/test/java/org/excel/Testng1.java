package org.excel;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng1 extends BaseClass {
	@Parameters({"use","pwd"})
	@Test
	private void tc01(@Optional("test4@gmail.com")String username, String password) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement locator = locator("id","email");
		textSend(locator,username);
		WebElement locator1 = locator("id","pass");
		textSend(locator1,password);
	}
	
	@DataProvider(name="datas")
	public Object[][] getData () throws FileNotFoundException, IOException{
		return new Object[][] {{readExcelData(1,0),readExcelData(1,1)}};

	}
	@Test(dataProvider="datas")
	private void tc02(String username, String password) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement locator = locator("id","email");
		textSend(locator,username);
		WebElement locator1 = locator("id","pass");
		textSend(locator1,password);
	}
}
