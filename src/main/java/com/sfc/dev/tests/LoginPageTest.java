package com.sfc.dev.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sfc.dev.base.TestBase;
import com.sfc.dev.pages.Loginpage;

public class LoginPageTest extends TestBase
{

	Loginpage login;
	public LoginPageTest(){
		super(); 
	}
	
	@BeforeMethod
	public void Setup(){
		
		initialization();
		 login=new Loginpage();
		
	}
	
	@Test
	public void loginpageTitleTest(){
		
		System.out.println("Working flow");
		
		String Title=login.validateLoginPageTitle();
		Assert.assertEquals( Title,"Grow Your Business With Canada's #1 Cloud-Based CRM System");
		
		//login.login(un, pwd);
		//
		
		//login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown(){
		
		//driver.quit();
		
	}
	
	
	
}
