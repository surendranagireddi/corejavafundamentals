package com.selenium.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoForDownLoadOpeartion {

	public static void main(String[] args) {

		//SetUp WebDriverManager
	    WebDriverManager.chromedriver().setup();
		//create a chromedriver object which is store one refernce variable in WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		// launch the website
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		// manage the window
		driver.manage().window().maximize();
		//set time implicitly 20 sec
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='anu.txt']"));
		ele.click();
		
		
	}

}
