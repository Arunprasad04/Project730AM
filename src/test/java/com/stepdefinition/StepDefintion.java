package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.excel.BaseClass1;
import org.excel.PageObject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion extends BaseClass1{
	PageObject1 page;
	@Given("user is on facebook page.")
	public void user_is_on_facebook_page() {
//		getDriver("chrome");
//		url("https://www.facebook.com/");
	
	}

	@When("user enter {string}username and {string}password")
	public void user_enter_username_and_password(String userName, String pwd) {
page=new PageObject1();
	WebElement user=page.getUserName();
	textSend(user,userName);
	WebElement password = page.getPwd();
	textSend(password,pwd);
	}


	@And("user click the login button and message displayed.")
	public void user_click_the_login_button() {
		
		page=new PageObject1();
		WebElement logIn = page.getLogIn();
		buttonClick(logIn);
	}
	
	@Then("verify success message is displayed")
	public void verify_success_message_is_displayed() {
	  System.out.println("message is displayed");
	  //quitBrowser();
	}
	

	@When("user enter username and passwords")
	public void user_enter_username_and_passwords(io.cucumber.datatable.DataTable dataTable) {
		//asList-method
		//asMaps-->method
		List<Map<String, String>> emp = dataTable.asMaps(String.class,String.class);
		page=new PageObject1();
		WebElement userName = page.getUserName();
		String object = emp.get(1).get("password");
		System.out.println(object);
//		WebElement pwd = page.getPwd();
//		textSend(pwd,emp.get(1).get(2));
		}
	@Given("user is on flipkart page.")
	public void user_is_on_flipkart_page() {
	 getDriver("chrome");
	 url("https://www.flipkart.com/");
	}

	@When("user enters {string} product name")
	public void user_enters_product_name(String producName) {
	   System.out.println(producName);
	}

	@Then("user click search icon")
	public void user_click_search_icon() {
	  System.out.println("Search icon");
	}

	@When("user click cart button icon")
	public void user_click_cart_button_icon() {
	   System.out.println("Cart button");
	}

	@Then("user successfully login in cart.")
	public void user_successfully_login_in_cart() {
	   System.out.println("Login cart");
	}
	@Given("User is on facebook pages")
	public void user_is_on_facebook_pages() {
		System.out.println("Browser Launching");
		System.out.println("Browser Launching1");
		System.out.println("Browser Launching2");
		driver.close();
//	getDriver("chrome");
//	url("https://www.facebook.com/");
	}
	}

