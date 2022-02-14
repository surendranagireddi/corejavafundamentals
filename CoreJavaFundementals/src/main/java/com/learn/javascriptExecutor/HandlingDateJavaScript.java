package com.learn.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDateJavaScript {
	
	public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
		   WebDriver driver= new ChromeDriver();			
		
	      		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
	      		
	      		WebElement departCal = driver.findElement(By.id("datepicker"));
	      		
	      		HandlingDateJavaScript.setDateUsingJavaScriptInCalendar(driver,"10/09/2017",departCal);
	    		
	    		
	}
	
	public static void setDateUsingJavaScriptInCalendar(WebDriver driver, String value, WebElement calLocator)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		String script= "arguments[0].setAttribute('value','"+value+"');";
		jse.executeScript(script, calLocator);
	}


	}


