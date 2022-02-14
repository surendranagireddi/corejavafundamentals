package com.selenium.learn;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcepts {

	public static void main(String[] args) {

		//WebDriverManager SetUp
		WebDriverManager.chromedriver().setup();
		//Creating chrome object with reference variable store in WebDriver Interface
		WebDriver driver = new ChromeDriver();
		//navigate to the url
		driver.navigate().to("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		//maximize the window
		driver.manage().window().maximize();
	
		 //Defining Implicit Wait for 30 Seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//finding element using xpath  and store in webelement and click
		WebElement element = driver.findElement(By.xpath("//button[text()='Click Me - Fluent Wait']"));
		element.click();
		
		
		  // Waiting 60 seconds for an element to be present on the page, checking
		   // for its presence once every 11 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(60, TimeUnit.SECONDS)
		       .pollingEvery(11, TimeUnit.SECONDS) // 5th iteration it found NoSuch Element Found
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement element = driver.findElement(By.xpath("//p[text()='Software Testing Material - DEMO PAGE']"));
		      // return driver.findElement(By.id("foo"));
		    	 return element;
		     }
		   });
		   System.out.println(driver.getTitle());		
	}

}
