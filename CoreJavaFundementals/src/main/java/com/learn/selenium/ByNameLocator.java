package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		//	System.setProperty("webdriver.firefox.driver", "src/test/resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		//	driver.get("https://chromedriver.chromium.org/");
	        
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			WebElement userElement = driver.findElement(By.name("txtUsername"));
			userElement.sendKeys("Admin");
			
			WebElement pwdElement = driver.findElement(By.name("txtPassword"));
			pwdElement.sendKeys("admin123");
			
			WebElement subElement = driver.findElement(By.name("Submit"));
			subElement.click();
			// driver.close();
	}

}
