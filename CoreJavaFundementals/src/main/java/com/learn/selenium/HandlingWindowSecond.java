package com.learn.selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowSecond {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		System.out.println("Print the tittle of the parent window : "+driver.getTitle());
   
		String parentWindows =driver.getWindowHandle();
		System.out.println(driver.getTitle()); // parent Window tittle Print
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		// converting the set into list
		ArrayList<String> list = new ArrayList<String>(allWindows);
		//one window to another window.
		driver.switchTo().window(list.get(1)); // cursor to the particular window.
		System.out.println(driver.getTitle()); // window 1 tittle get printed.
		
	}

}
