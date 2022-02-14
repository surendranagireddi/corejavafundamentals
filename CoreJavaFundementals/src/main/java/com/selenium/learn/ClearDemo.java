package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearDemo {
	public static void main(String[] args) throws InterruptedException  {
		

	    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");			
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		WebElement userElement = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		userElement.sendKeys("Admin");
		
		Thread.sleep(5000);
		
	//	userElement.clear();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("admin123").sendKeys(Keys.RETURN).build().perform();
		
	}

}
