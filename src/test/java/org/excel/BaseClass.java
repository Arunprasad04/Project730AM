package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void getDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}	
}
	public static void url(String url) {
		driver.get(url);
	}
	public static WebElement locator(String locator, String attributeValue) {
		if(locator.equalsIgnoreCase("id")) {
			WebElement findElement = driver.findElement(By.id(attributeValue));
			return findElement;
		}
		else if(locator.equalsIgnoreCase("name")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		}
		else if(locator.equalsIgnoreCase("xpath")) {
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
		File sourceFile = tk.getScreenshotAs(OutputType.FILE);
		File targetFile=new File("C:\\Excel\\"+name+".jpeg");
		FileUtils.copyFile(sourceFile, targetFile);
	}
	public static void staticWait(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static void quitBrowser() {
		driver.quit();

	}
	public static Object readExcelData(int rownum, int cellnum) throws FileNotFoundException, IOException {
		Workbook w=new XSSFWorkbook(new FileInputStream(new File("C:\\Excel\\UserNamePwd.xlsx")));
		Sheet s=w.getSheet("Family");
	
			Row row = s.getRow(rownum);
		
				Cell cell = row.getCell(cellnum);
				CellType cellType = cell.getCellType();
				String value="";
				switch(cellType) {
				case STRING:
				    value = cell.getStringCellValue();
				    break;
				case NUMERIC:
					double numericCellValue = cell.getNumericCellValue();
					value = BigDecimal.valueOf(numericCellValue).toString();
					break;
					default:
						break;
									
				}
			return value;
		
	}
}
