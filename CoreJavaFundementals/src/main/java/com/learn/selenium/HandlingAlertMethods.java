package com.learn.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("cusid"));
		element.sendKeys("86898");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
	//	alert.getText();
		//alert.dismiss();
		
	//	System.out.println(alert.getText());
		
		
		
	}

}
