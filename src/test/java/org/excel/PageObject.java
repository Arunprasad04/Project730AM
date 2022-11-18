package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends BaseClass {
    @FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	@FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
	private WebElement pwd;
	@CacheLookup
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
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
	public PageObject() {
		PageFactory.initElements(driver, this);
	}
}
