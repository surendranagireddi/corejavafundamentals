package com.learn.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScrollDemo {

	public static void main(String[] args) throws InterruptedException {

		//Set up a webdriver
		   WebDriverManager.chromedriver().setup();  
		   //creating a chrome object and storing one refernce variable in Webdriver interface
		    WebDriver driver=new ChromeDriver();  
		     // navigate the url of the we site
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  
		      // maximize the window
			 driver.manage().window().maximize();  
		      // set a implicit wait for 20 sec	 
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   //casting driver and the reference variable stored in JavascriptExecutor interface
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("scrollBy(0,50000)");
			   
			   Thread.sleep(50000);
			 
			   js.executeScript("scrollBy(5000,3000)");
			   
	}

}
