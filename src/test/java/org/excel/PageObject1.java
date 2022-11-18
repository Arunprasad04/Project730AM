package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBys;
public class PageObject1 extends BaseClass1{

	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement userName;
	@FindBys({@FindBy(name="pass"),@FindBy(xpath="//input[@type='password']")})
	private WebElement pwd;
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@name='login']")})
	private WebElement logIn;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	public PageObject1() {
		PageFactory.initElements(driver, this);
	}
}
