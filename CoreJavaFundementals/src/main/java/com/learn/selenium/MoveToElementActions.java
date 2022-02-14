package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		WebElement target = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
	   Actions action = new Actions(driver);
	   action.moveToElement(target).build().perform();
	   
	   WebElement brokenLinks = driver.findElement(By.xpath("//a[text()='Broken Links']"));
	   brokenLinks.click();
	}

}
