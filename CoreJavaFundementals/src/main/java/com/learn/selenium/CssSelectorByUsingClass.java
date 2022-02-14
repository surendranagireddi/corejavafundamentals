package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorByUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.yahoo.com/?YY=28789&order=down&sort=date&pos=0&.src=ym");
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			WebElement obj = driver.findElement(By.cssSelector("input.phone-no"));
			obj.sendKeys("Sagar");
			
			

	}

}
