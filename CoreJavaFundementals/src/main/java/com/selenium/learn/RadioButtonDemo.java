package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) {

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

				//find the radiobutton element in the we page using xpath stored in webelement and click
				WebElement singleRadio=driver.findElement(By.xpath("//input[@type='radio' and @id='vfb-7-2']"));
				
				
			    singleRadio.click();
			    
			    System.out.println(singleRadio.isEnabled()); //true
			    System.out.println(singleRadio.isDisplayed());//true
			    System.out.println(singleRadio.isSelected()); //true
	}

}
