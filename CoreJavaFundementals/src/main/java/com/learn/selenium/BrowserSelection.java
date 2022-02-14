package com.learn.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelection {
	static WebDriver driver;

	public static WebDriver usingChrome()
	{
		
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
		 
		 
			WebDriver driver = new ChromeDriver();
		
       	driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	return driver;
	}

}
