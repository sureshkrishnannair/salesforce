package com.sfc.dev.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sfc.dev.base.TestBase;
import com.sfc.dev.pages.HomePage;
import com.sfc.dev.pages.Loginpage;

public class LoginPageTest extends TestBase {

	Loginpage login;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {

		initialization();
		login = new Loginpage();

	}

	@Test(priority = 1)
	public void loginpageTitleTest() {

		System.out.println("Working flow");

		String Title = login.validateLoginPageTitle();
		Assert.assertEquals(Title, "Login | Salesforce");

		// login.login(un, pwd);
		//

		// login.login(prop.getProperty("username"),
		// prop.getProperty("password"));

	}

	@Test(priority = 2)
	public void loginpageLoginTest() {

		homepage=login.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {

		 driver.quit();

	}

}
