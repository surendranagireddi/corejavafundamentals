package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebApplicationTest1 {

	public static void main(String[] args) {
try {
		WebDriverManager.chromedriver().setup();
		//creating  chromedriver object refernce variable store in WebDriver
		WebDriver driver = new ChromeDriver();
		
		// get the url
		driver.get("https://www.flipkart.com/");
		//manage the window
		driver.manage().window().maximize();
		

		WebElement ele = driver.findElement(By.className("_2doB4z"));
		ele.click();
		
		WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("slippers");
		 WebElement ele1 = driver.findElement(By.xpath("//button[@type='submit']"));
		 ele1.click();
		
		
	//	WebElement dropDown = driver.findElement(By.xpath("//div[text()='Fashion']"));
	     
	       
	//      dropDown.click(); 
		
	//	Select sc = new Select(dropDown);
	//	sc.selectByIndex(2);
		
}catch(Exception e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
}
		
		
		
		
	}

}
