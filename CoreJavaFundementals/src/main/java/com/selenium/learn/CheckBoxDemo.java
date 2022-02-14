package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) {

		//input[@type='checkbox']
   //	in this web page we are findelement method we get 3 elements
   //		in that case use 
		//input[@type='checkbox' and@id='vfb-6-1']

		
		//WebDriverManager SetUp
		WebDriverManager.chromedriver().setup();
		//Creating chrome object with reference variable store in WebDriver Interface
		WebDriver driver = new ChromeDriver();
		//get the url of the website
		driver.get("http://demo.guru99.com/test/radio.html");
		//maximize the window
		driver.manage().window().maximize();
		String tittle = driver.getTitle();
		//print the tittle in the driver 
		System.out.println(tittle);
		
		//find the chckbox element in the we page using xpath stored in webelement and click
		WebElement singleCheckBox=driver.findElement(By.xpath("//input[@type='checkbox' and@id='vfb-6-1']"));
		
	    singleCheckBox.click();
	    
	    System.out.println(singleCheckBox.isEnabled());
	    System.out.println(singleCheckBox.isDisplayed());
	    System.out.println(singleCheckBox.isSelected());
	    
	}

}
