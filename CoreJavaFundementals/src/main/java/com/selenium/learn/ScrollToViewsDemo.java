package com.selenium.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToViewsDemo {

	public static void main(String[] args) {

		//SetUp WebDriverManager
	    WebDriverManager.chromedriver().setup();
		//create a chromedriver object which is store one refernce variable in WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		// launch the website
		driver.get("https://www.amazon.in/");
		// manage the window
		driver.manage().window().maximize();
		//set time implicitly
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//get tittle of the webpage
		String tittle = driver.getTitle();
		System.out.println("Tittle of the WebPage " +tittle);
		
		//create a object of JavascriptExecutor Interface using TypeCasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	 // js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//a[text()='About Us']")));
	    
		// //img[@alt='VIVO Phones starting Rs 9490']
	   js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//img[@alt='VIVO Phones starting Rs 9490']")));
	    
		
	}

}
