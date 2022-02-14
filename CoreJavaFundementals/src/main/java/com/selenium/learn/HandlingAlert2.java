package com.selenium.learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("user_full_name"));
		username.sendKeys("rama");
		WebElement email =driver.findElement(By.id("user_email_login"));
		email.sendKeys("rama@yahoo.com");
		WebElement pwd =driver.findElement(By.id("user_password"));
		pwd.sendKeys("username123");
		WebElement submit =driver.findElement(By.id("user_submit"));
		submit.click();



		Alert alert = driver.switchTo().alert();

		String alertMessage= driver.switchTo().alert().getText(); 

		System.out.println(alertMessage); 
		
	//	alert.accept(); 
		}
		
	
		
	}


