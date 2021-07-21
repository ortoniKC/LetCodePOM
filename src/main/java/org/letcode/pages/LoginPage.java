package org.letcode.pages;

import org.letcode.seleniumBase.LetCodeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends LetCodeBase{

	public LoginPage(RemoteWebDriver driver) {
		this.driver  = driver;

	}

	//	RemoteWebDriver driver = null;
	// locators
	public boolean getUsernameLabel(){
		driver.switchTo().frame(0);
		// wait
		return driver.findElementByXPath("//label[@for='user_name']").isDisplayed();
	}
	public boolean getPasswordLabel(){
		return driver.findElementByXPath("//label[@for='user_password']").isDisplayed();
	}
	public boolean getLanguageLabel(){
		return driver.findElementByXPath("//label[@for='language_select']").isDisplayed();
	}

	// actions
	/**
	 * @description - get the data from user and type on the user name field
	 * @param username -  pass the user to be login
	 * @return 
	 */
	public LoginPage enterUserName(String username){
		driver.findElementById("user_name").sendKeys(username);
		return this;
	}
	public LoginPage enterUserPassword(String password){
		driver.findElementById("user_password").sendKeys(password);
		return this;
	}
	public LoginPage selectLanguage(String lang) {
		WebElement languageDD = driver.findElementById("language_select");
		new Select(languageDD).selectByVisibleText(lang);
		return this;
	}
	public DashBoardPage clickLogin() {
		driver.findElementById("sysverb_login").click();
		return new DashBoardPage();
	}
	public ForgotPassWordPage  clickForgotPassword(){
		driver.findElementByLinkText("Forgot Password ?").click();
		return new ForgotPassWordPage();
	}
	/**
	 * @description this function used to login into the service now application
	 * @param username
	 * @param pass
	 */
	public void login(String username, String pass) {
		driver.switchTo().frame(0);
		enterUserName(username);
		enterUserPassword(pass);
		clickLogin();
	}

}
