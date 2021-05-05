package org.letcode.test;

import org.letcode.pages.LoginPage;
import org.letcode.seleniumBase.LetCodeBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002Login extends LetCodeBase{
	
	@BeforeTest
	public void setData() {
		fileName = "TC002";
	}
	@Test(dataProvider = "data")
	public void loginTest2() {
		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName(null);
		 * lp.enterUserPassword(null);
		 */

		LoginPage lp = new LoginPage(driver);
		boolean usernameLabel = lp.getUsernameLabel();
		Assert.assertEquals(usernameLabel, true);
		boolean passwordLabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordLabel);
		boolean languageLabel = lp.getLanguageLabel();
		Assert.assertTrue(languageLabel);

		new LoginPage(driver)
		.enterUserName("admin")
		.enterUserPassword("Pass123$")
		.clickLogin();
	}

}
