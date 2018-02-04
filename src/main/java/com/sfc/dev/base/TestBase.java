package com.sfc.dev.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sfc.dev.utils.TestUtil;


public class TestBase 

{
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
	
	try {

		prop = new Properties();

		FileInputStream ip = new FileInputStream("C:/Users/suresh/workspace/salesforce/src/main/java/com/sfc/dev/config/config.properties");

		prop.load(ip);

	} catch (FileNotFoundException e){

		e.printStackTrace();

	} catch (IOException e)	{

		e.printStackTrace();

	}

}
	
	public static void initialization()
	
	{

		String browserName = prop.getProperty("browser");

		

		if(browserName.equals("chrome")){

			System.setProperty("webdriver.chrome.driver", "C:/Suresh/Selenium Configuration/chromedriver.exe");	

			driver = new ChromeDriver(); 

		}

		else if(browserName.equals("FF")){

			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	

			driver = new FirefoxDriver(); 

		}
		
		else if(browserName.equals("IE")){

			System.setProperty("webdriver.ie.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	

			driver = new InternetExplorerDriver(); 

		}
	

		//e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver

		//eventListener = new WebDriverEventListener();

		//e_driver.register(eventListener);

		//driver = e_driver;

		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

}

}