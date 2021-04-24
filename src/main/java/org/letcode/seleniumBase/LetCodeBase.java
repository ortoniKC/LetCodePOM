package org.letcode.seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LetCodeBase {

	String URL = "https://dev66365.service-now.com/navpage.do";

	protected RemoteWebDriver driver = null;

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
