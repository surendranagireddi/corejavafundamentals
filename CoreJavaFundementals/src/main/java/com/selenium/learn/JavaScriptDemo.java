package com.selenium.learn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemo {

	public static void main(String[] args) {
       
		// Set up a WebdriverManager
		WebDriverManager.chromedriver().setup();
		//Creating a chrome Driver Object
	   WebDriver driver = new ChromeDriver();
	   //navigate to url
	   driver.navigate().to("https://www.google.com/");
	   //maximize the window
	   driver.manage().window().maximize();
	   //get a tittle
	   String tittle = driver.getTitle();
	   // print tittle of the website
	   System.out.println(tittle);
	   //type casting the driver
	   JavascriptExecutor js =(JavascriptExecutor)driver; //downcasting
	//   js.executeScript("alert('Hi Javascript Executor demo')");
	   js.executeScript("confirm('Are you sure about this')");
	   
	}

}
