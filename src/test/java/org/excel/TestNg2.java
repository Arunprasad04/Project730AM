package org.excel;

import org.testng.annotations.DataProvider;

public class TestNg2 {
//	@DataProvider(name="login")
//	public Object[][] getData() {
//		return new Object[][] {{"test1@gmail.com","fdfa43334"},{"asfsfer@gmail.com","34343243@gmail.com"}};
//
//	}
	@DataProvider(name="datas")
	public static Object[][] getData(){
		return new Object[][] {{"Test1@gmail.com","23423432"},{"Test2@gmail.com","4875457"}};
	}
		

}
