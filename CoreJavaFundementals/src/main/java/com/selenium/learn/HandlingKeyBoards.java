package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoards {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	       
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		String title =driver.getTitle();
		System.out.println(title);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.RETURN);
		
		
	}

}
