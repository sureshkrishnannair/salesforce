package com.sfc.dev.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfc.dev.base.TestBase;

public class Loginpage extends TestBase

{
	
	//Page Factory
	
	@FindBy (name="username")
	WebElement username;
	
	@FindBy (id="password")
	WebElement password;
	
	@FindBy (name="Login")
	WebElement Login;
	
	//Constructer
	//Initializing the Page Objects:

		public Loginpage(){

			PageFactory.initElements(driver, this);
}
		
		//Actions
		
		public String validateLoginPageTitle(){

			return driver.getTitle();

		}
		
		public HomePage login(String un, String pwd)
		
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			Login.click();
			return new HomePage();
		}
		
		
}
