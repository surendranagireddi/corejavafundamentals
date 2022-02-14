package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	//	System.setProperty("webdriver.firefox.driver", "src/test/resources/chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");	
		 WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	//	driver.get("https://chromedriver.chromium.org/");
        
		driver.get("https://www.google.com/");
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		
		
		WebElement element = driver.findElement(By.name("q"));
	//	element.sendKeys("selenium");
	//	driver.close();     // close the driver
	//	driver.findElement(By.)  //single web element from browser.
		
		
		
		//driver.getCurrentUrl(); // current url
	
		

		
	}

}
