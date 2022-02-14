package com.learn.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShotsDemo {

	public static void main(String[] args) throws IOException {

		//Set up a webdriver
		   WebDriverManager.chromedriver().setup();  
		   //creating a chrome object and storing one refernce variable in Webdriver interface
		    WebDriver driver=new ChromeDriver();  
		     // navigate the url of the we site
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  
		      // maximize the window
			 driver.manage().window().maximize();
			 String tittle = driver.getTitle();
			 System.out.println(tittle);
		      // set a implicit wait for 20 sec	 
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   
			   driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 

			   CaptureScreeshots.CaptureScreen(driver,"AnotherOrange"); 
			   
			   
			//   TakesScreenshot tc = (TakesScreenshot)driver;
	
	        //      File source =tc.getScreenshotAs(OutputType.FILE);
	              
	        //      FileUtils.copyFile(source, new File("src/main/resources/Orange.png"));
	
	             
	
	}

}
