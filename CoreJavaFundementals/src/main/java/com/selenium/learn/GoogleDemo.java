package com.selenium.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
			//create a chrome driver object
				WebDriver driver = new ChromeDriver();
				// navigate the browser
				driver.navigate().to("https://www.google.co.in/");
				//maximize the window
				driver.manage().window().maximize();
				
	}

}
