package com.learn.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			/*WebElement userElement = driver.findElement(By.className());
	     	userElement.sendKeys("Admin");
			
			WebElement pwdElement = driver.findElement(By.className());
			pwdElement.sendKeys("admin123");
			
			WebElement subElement = driver.findElement(By.className());
			subElement.click();
			// driver.close();
*/
			
			 
	}

}
