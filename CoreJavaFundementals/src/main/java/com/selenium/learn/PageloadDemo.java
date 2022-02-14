package com.selenium.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageloadDemo {

	public static void main(String[] args) throws InterruptedException {
      
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		
		//dynamic wait
		//Static wait Thread.sleep(20);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//implicit wait
		//It is applicable for every element
		//Dynamic Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement target=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions action=new Actions(driver);
//		
		action.moveToElement(target).build().perform();
		
		Thread.sleep(1);
		
	//	WebElement spiceMax=driver.findElement(By.xpath("//div[text()='SpiceMAX']"));
		WebElement spiceMax=driver.findElement(By.xpath("//div[text()='Visa Services']"));
		spiceMax.click();
		
	}

}
