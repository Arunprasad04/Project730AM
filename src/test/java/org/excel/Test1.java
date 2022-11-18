package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Test1 extends BaseClass1 {
public static void main(String[] args) throws IOException, InterruptedException {
	Test1 t=new Test1();
	t.getDriver("edge");
	t.url("https://www.facebook.com/login/");
	PageObject1 p=new PageObject1();
	WebElement userName = p.getUserName();
    t.textSend(userName, "afsjfak@gmail.com");
    WebElement pwd = p.getPwd();
    t.textSend(pwd, "1232224");
    WebElement logIn = p.getLogIn();
    t.buttonClick(logIn);
	
}
}
