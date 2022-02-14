package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			WebElement obj = driver.findElement(By.cssSelector("input#txtUsername"));
			obj.sendKeys("Admin");
			
			WebElement elt = driver.findElement(By.cssSelector("input#txtPassword"));
			elt.sendKeys("admin123");
			
			WebElement subElement = driver.findElement(By.cssSelector("input#btnLogin"));
			subElement.click();

	}

}

