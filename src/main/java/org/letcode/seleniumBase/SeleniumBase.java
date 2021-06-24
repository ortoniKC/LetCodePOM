package org.letcode.seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase implements SeleniumAPI{
	long timeOuts = 30;
	long maxWaitTime =10;

	RemoteWebDriver driver = null;
	WebDriverWait wait = null;

	public void setUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(timeOuts, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWaitTime);
	}

	public void setUp(Browser browserName, String url) {
		switch (browserName) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			System.err.println("Driver is not defined");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().
		implicitlyWait(timeOuts, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWaitTime);
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public WebElement element(Locators type, String value) {
		switch (type) {
		case id:
			return driver.findElement(By.id(value));
		case name:
			return driver.findElement(By.name(value));
		case xpath:
			return driver.findElement(By.xpath(value));
		case link:
			return driver.findElement(By.linkText(value));
		default:
			break;
		}
		return null;
	}

	public void switchToWindow(int i) {


	}

	public void selectValue(WebElement ele, String value) {


	}

	public void selectText(WebElement ele, String text) {


	}

	public void selectIndex(WebElement ele, int position) {


	}

	public void click(WebElement ele) {
		WebElement element = wait
				.withMessage("Element is not clickable")
				.until(ExpectedConditions
						.elementToBeClickable(ele));
		element.click();
	}

	public void type(WebElement ele, String testData) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.clear();
		element.sendKeys(testData);
	}
	public void type(WebElement ele, String testData, Keys keys) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.clear();
		element.sendKeys(testData, keys);
	}

	public void appendText(WebElement ele) {


	}

	public String getTitle() {

		return null;
	}

	public String getURL() {

		return null;
	}

	public boolean isDisplayed() {

		return false;
	}

	

}
