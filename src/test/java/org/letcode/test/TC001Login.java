package org.letcode.test;

import org.letcode.pages.LoginPage;
import org.letcode.seleniumBase.LetCodeBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001Login extends LetCodeBase{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}
	
	@Test(dataProvider = "data")
	
	public void loginTest(String[] data) {// string un, string pass
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
		.enterUserName(data[0])
		.enterUserPassword(data[1])
		.clickLogin();
	}

}
