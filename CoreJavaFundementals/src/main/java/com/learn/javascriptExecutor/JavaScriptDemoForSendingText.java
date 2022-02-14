package com.learn.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class JavaScriptDemoForSendingText {

	public static void main(String[] args) {
   try {
		//Set up a webdriverManager
		WebDriverManager.chromedriver().setup();  
   //creating a chromedriver object and storing in one refernce variable in Webdriver interface
		WebDriver driver=new ChromeDriver();  
     // navigate the url of the we site
		        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");  
      // maximize the window
		        driver.manage().window().maximize();  
      // set a implicit wait for 20 sec	 
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
      // find userElement using by id and store in webElement
		     WebElement user=driver.findElement(By.id("txtUsername")); 
		      
		      driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
		      
		   // find pwdElement using by id and store in webElement
		     WebElement pwd=driver.findElement(By.id("txtPassword")); 
		      
		  //    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     
		   // find loginElement using by id and store in webElement
		      WebElement loginBtn=driver.findElement(By.id("btnLogin"));  

		  //create the JavascriptExecutor object which is store reference variable js cast the driver
		      
    	      JavascriptExecutor js=(JavascriptExecutor)driver;
		
    	      js.executeScript("arguments[0].value ='Admin'", user);
		      js.executeScript("arguments[0].value='admin123'", pwd);  
		      js.executeScript("arguments[0].click()",loginBtn);  
   }catch(Exception e) {
	   e.printStackTrace();
	 System.out.println( e.getMessage()); 
   }
		  
	}

}
