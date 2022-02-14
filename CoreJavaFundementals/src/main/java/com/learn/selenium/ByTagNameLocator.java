package com.learn.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
			WebDriver driver = new ChromeDriver();	       
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();	 
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
		List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
		System.out.println(listOfInputs.size());
	
	}

}
