package com.selenium.learn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws IOException {

		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
		//create a chrome driver object
			WebDriver driver = new ChromeDriver();
			// navigate the browser
			driver.navigate().to("https://www.google.co.in/");
			//maximize the window
			driver.manage().window().maximize();
			
			// finding the  a elements using tagname which is storing in list of Webelements
			List<WebElement> listofHyperlink = driver.findElements(By.tagName("a"));
			// finding the size of hyperlink
			int numberOfLinks = listofHyperlink.size();
			
			for(int i=0;i<numberOfLinks;i++) {
				WebElement ele = listofHyperlink.get(i);
				String urlLink=ele.getAttribute("href");
				
				//eate an object of URL class and parse href urls as an argument
				URL url = new URL(urlLink);
				//create connection with http
				HttpURLConnection httpurlConnection= (HttpURLConnection) url.openConnection();
				//set the connection timouts and invoke the connection
				httpurlConnection.setConnectTimeout(3000);
				httpurlConnection.connect();
				
				//connected with server
				
				if(httpurlConnection.getResponseCode()==200) {
					System.out.println(urlLink +"is working fine"+httpurlConnection.getResponseMessage());
					
				}
				if(httpurlConnection.getResponseCode() ==  httpurlConnection.HTTP_NOT_FOUND)
				{
					System.out.println(urlLink+"is not working "+ httpurlConnection.getResponseMessage());
					
				}
				
			}
			
			
			
			
			
			
			
	//		driver.close();// it will close only current window where driver will be available
    //			driver.quit(); // it will close all the window where driver will be available

	}

}
