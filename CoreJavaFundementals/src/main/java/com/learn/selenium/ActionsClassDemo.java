package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemo {

	public static void main(String[] args) {
     //SendKey("")
	 // alternate way to send some text to the textbox in webpage
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		 
		 WebElement userTxtBox = driver.findElement(By.name("txtUsername"));
		 WebElement pwdTxtBox = driver.findElement(By.name("txtPassword"));
		 Actions action = new Actions(driver);
		 action.sendKeys(userTxtBox, "Admin").build().perform();
		 action.sendKeys(pwdTxtBox, "admin123").build().perform();
		 WebElement submit = driver.findElement(By.name("Submit"));
		 
		 //action.click().build().perform();
		 submit.click();
		 
		 
		
		
	}

}
