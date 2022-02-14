package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xpath Locator Demo
		//  //input[@name='txtUsername']
		//  //input[@id='txtPassword']
		  //input[@type='submit']
		
		    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");			
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			WebElement userElement = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			userElement.sendKeys("Admin");
			
			WebElement pwdElement = driver.findElement(By.xpath("//input[@id='txtPassword']"));
			pwdElement.sendKeys("admin123");
			
			WebElement subElement = driver.findElement(By.xpath("//input[@type='submit']"));
			subElement.click();

			

	}

}
