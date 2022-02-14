package com.selenium.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileDemo {

	public static void main(String[] args) {

		//SetUp WebDriverManager
	    WebDriverManager.chromedriver().setup();
		//create a chromedriver object which is store one refernce variable in WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		// launch the website
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		// manage the window
		driver.manage().window().maximize();
		//set time implicitly 20 sec
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//find the element in the we page using By name stored in webelement and click
		WebElement element = driver.findElement(By.name("uploadfile_0"));
		element.sendKeys("C:\\Users\\hpadmin\\eclipse-workspace\\CoreJavaFundementals\\src\\main\\resources\\test.txt");

		//find the checkbox element using id and click
		driver.findElement(By.id("terms")).click();

		//find the submit element by using id and click
		driver.findElement(By.id("submitbutton")).click();
		
		
		
		
	}

}
