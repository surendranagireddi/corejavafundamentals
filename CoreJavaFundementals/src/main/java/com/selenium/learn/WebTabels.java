package com.selenium.learn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabels {

	public static void main(String[] args) {
		//SetUp WebDriverManager
	WebDriverManager.chromedriver().setup();
		//create a chrome driver object
		WebDriver driver = new ChromeDriver();
		
		// launch the website
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// manage the window
		driver.manage().window().maximize();
		//set time implicitly
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//get tittle of the webpage
		String tittle = driver.getTitle();
		System.out.println("Tittle of the WebPage " +tittle);
		
		// list of web elements
		  List<WebElement> element = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		//row count store in integer
		  int rowCount = element.size();
		// print the rowcount
		  System.out.println("row size"+rowCount);
		  
		 WebElement ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]"));
		 System.out.println(ele.getText()); 
			
			 System.out.println("=================Company Name==========="); 
			 for(int i=2;i<=rowCount;i++) { 
				 WebElement element1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")); 
				 System.out.println(element1.getText());
			  if(element1.getText().equalsIgnoreCase("Centro comercial Moctezuma")) {
			  System.out.println("requried Company name is available"); break; }
			  
			  }
			 
			  System.out.println("=================Contact===========");
			  
			  for(int i=2;i<=rowCount;i++) { WebElement
			  element1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[2]"));
			  System.out.println(element1.getText()); }
			  System.out.println("=================Country===========");
			  
			  for(int i=2;i<=rowCount;i++) {
				  WebElement element1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]"));
				  System.out.println(element1.getText()); }
			 
	}
}
