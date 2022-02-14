package com.learn.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowInSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		System.out.println("Tittle of the page is : "+driver.getTitle());
    	WebElement element = driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
        element.click();
        
        System.out.println("Print the tittle of the parent window"+driver.getTitle());
      String parentWindows = driver.getWindowHandle();  // returns parent window , means which window we used
      
      Set<String> allWindows = driver.getWindowHandles(); // returns set of windows, we select set it uniquly, value can not be duplicated
      
    Iterator<String> itr = allWindows.iterator(); // the windows returing in the form of Strings.
    
    while(itr.hasNext()) { // iterate the windows
    	String childWindow = itr.next();  // child window
    	if(!parentWindows.equalsIgnoreCase(childWindow)) {
    		driver.switchTo().window(childWindow); // cursor is available on child window.
    		WebElement ele = driver.findElement(By.name("q"));
    		ele.sendKeys("Selenium"); // pass the send keys, pass the selenium to the search bar
    	}
    }
      driver.switchTo().window(parentWindows); // return to the parent window.
    	
	}

}
