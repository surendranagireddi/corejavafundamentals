package com.learn.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizentalScrollBarDemo {

	public static void main(String[] args) {
       //Set up a driver
		WebDriverManager.chromedriver().setup();  
       // creating a object of chrome driver
		WebDriver driver=new ChromeDriver();  
        // navigate to the website
		 driver.navigate().to("https://www.album.alexflueras.ro/index.php");  
		 //maximize the window
		  driver.manage().window().maximize();  
          //Set a implecit Wait
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
             //Casting a driver and reference variable stored in JavascriptExecutor interface
		      JavascriptExecutor js=(JavascriptExecutor)driver;  

		  //horizentally set scroll
		      js.executeScript("window.scrollBy(60000,0)");  

		  
	}

}
