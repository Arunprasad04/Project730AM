package org.excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;
	public static void getDriver(String browser) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	public static void url(String url) {
	driver.get(url);
	}
	public static String  getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static String getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
return currentUrl;
	}
	public static WebElement locator(String locator, String attributeValue) {
		if(locator.equals("id")) {
			WebElement findElement = driver.findElement(By.id(attributeValue));
			return findElement;
		}
		else if(locator.equals("name")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		}
		else if(locator.equals("xpath")) {
			WebElement findElement = driver.findElement(By.xpath(attributeValue));
			return findElement;
		}
		else {
			WebElement findElement = driver.findElement(By.tagName(attributeValue));
			return findElement;
		}
	}
	public static void textSend(WebElement findElement, String values) {
		findElement.sendKeys(values);
      
	}
	public static void buttonClick(WebElement findElement) {
		findElement.click();

	}
	public static void screenShot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File SourceFile=tk.getScreenshotAs(OutputType.FILE);
		File targetFile=new File("C:\\Excel\\"+name+".jpeg");
        FileUtils.copyFile(SourceFile, targetFile);
	}
	public static void staticWait(long time) throws InterruptedException {
		Thread.sleep(time);

	}
	public static void quitBrowser() {
		driver.quit();

	}
}
