package org.excel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg3 extends BaseClass1 {


//@Test(invocationCount=10)
//private void tc01() {
//	System.out.println("tc01");
//
//}
//@Test(dataProvider="datas",dataProviderClass=TestNg2.class)
//private void tc02(String userName, String password) {
//	getDriver("chrome");
//	url("https://www.facebook.com/");
//	WebElement user = locator("id","email");
//	textSend(user,userName);
//	WebElement pwd = locator("id","pass");
//	textSend(pwd,password);
//}
@Parameters({"userName","passWord"})
@Test
private void tc03(String userName,@Optional("Test@gmail.com")String passWord) {
	getDriver("chrome");
	url("https://www.facebook.com/");
	WebElement user = locator("id","email");
	textSend(user,userName);
	WebElement pwd = locator("id","pass");
	textSend(pwd,passWord);
}
	@Test(groups="smoke")
	private void tc05() {
		System.out.println("tc05");
	}
	@Test(groups= {"Regression","smoke"})
	private void tc06() {
		System.out.println("tc06");
	}
}
