package org.letcode.seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class LetCodeBase{

	String URL = "dev62773.service-now.com/";

	protected RemoteWebDriver driver = null;
	public String fileName = "";
	
	@DataProvider(name="data")
	public String[][] dataProvider() {
		String[][] excelData = ReadExcel.getExcelData(fileName);
		return excelData;
	}

	@BeforeMethod
	public void startApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
