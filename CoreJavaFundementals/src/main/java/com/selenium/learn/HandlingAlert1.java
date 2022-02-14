package com.selenium.learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		
		WebElement inputEmail = driver.findElement(By.xpath("//input[@name='id']"));
		inputEmail.sendKeys("surendra@yahooo.com");

		WebElement pwdEmail = driver.findElement(By.xpath("//input[@name='num']"));
		pwdEmail.sendKeys("kumar3224");
		
		WebElement submit = driver.findElement(By.xpath("//input[@value='Login']"));
		submit.click();
		
		Alert alert =driver.switchTo().alert();
	
	  // String alertMessage= driver.switchTo().alert().getText(); 

	//	System.out.println(alertMessage); 
		  alert.getText();
	//	System.out.println(alert.getText());
		
		
		
	}

}
