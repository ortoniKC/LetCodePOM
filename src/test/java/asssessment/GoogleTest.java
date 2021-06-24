package asssessment;

import org.letcode.seleniumBase.Browser;
import org.letcode.seleniumBase.Locators;
import org.letcode.seleniumBase.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase{

	@Test
	void searchLetcode() throws InterruptedException {
		setUp(Browser.CHROME, "https://www.google.com/");
//		WebElement search = element(Locators.name, "q");
		type(element(Locators.name, "q"), 
				"letcode with koushik",
				Keys.ENTER);
//		Thread.sleep(3000);
		quit();
	}
}
