package org.letcode.seleniumBase;

import org.openqa.selenium.WebElement;

public interface SeleniumBase {
	/**
	 * This method will launch the chrome browser with the given URL
	 * @author koushik
	 * @param url
	 * @exception NullPointerException, URLMalfunction
	 */
	
	// TODO:
	void setUp(String url);
	
	/**
	 * This method will launch the given browser with the given URL
	 * @author koushik
	 * @param url
	 * @param browserName
	 */
	
	void setUp(String browserName, String url);
	
	void close();
	
	void quit();
	
	/**
	 * This method is used to find any webelement with in the page
	 * @param type - element type eg - id, name or linkText
	 * @param value - element value
	 * @return WebElement
	 */
	
	WebElement element(String type, String value);
	
	
	void switchToWindow(int i);
	
	
	void selectValue(WebElement ele, String value);
	
	void selectText(WebElement ele, String text);
	
	void selectIndex(WebElement ele, int position);
	
	void click(WebElement ele);
	
	void type(WebElement ele);
	
	void appendText(WebElement ele);
	
	String getTitle();
		
	String getURL();
	
	boolean isDisplayed();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
