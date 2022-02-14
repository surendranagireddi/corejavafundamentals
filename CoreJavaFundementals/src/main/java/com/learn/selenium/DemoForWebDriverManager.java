package com.learn.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoForWebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //  System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		//WebDriverManager.operadriver().setup();
		WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/");
				
				
				String tittle = driver.getTitle();
				System.out.println(tittle);
					

	}

}
