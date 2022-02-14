package com.learn.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		List<WebElement> options = driver.findElements(By.xpath("//select[@name='Country']/option"));
		System.out.println("Size of the elements =" +options.size());
	   
		for (WebElement obj : options) {
			if((obj.getText()).equals("India")) {
			System.out.println(obj.getText());
			obj.click();
			break;
			}
		}
	}

}
