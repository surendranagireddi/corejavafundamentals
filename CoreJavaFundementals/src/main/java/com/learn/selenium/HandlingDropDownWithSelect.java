package com.learn.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownWithSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println("Tittle of the page is : "+driver.getTitle());
    	WebElement dropDown = driver.findElement(By.cssSelector("select.col-lg-3"));
	//	   dropDown.sendKeys("Google");
    	
		Select sc = new Select(dropDown);
	//	sc.selectByIndex(2);
	//	sc.selectByValue("Yahoo");
	//	sc.selectByVisibleText("Yahoo");
	//	System.out.println(sc.isMultiple());
		
		 List<WebElement> options = sc.getOptions();
		 // Aim is to select Particular element.
		 for (WebElement obj : options) {
			 if(obj.getText().equalsIgnoreCase("Google"))
			 {
			 obj.click();
			 break;
				 
		 }
			
		}

	}

}