package com.selenium.learn;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownLoadFilesDemo {

	public static void main(String[] args) {

		File folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		Map<String,Object> prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups",0);
		prefs.put("download.default_directory",folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities capabilities =DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY,prefs);
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(capabilities);
		
		// launch the website
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		// manage the window
		driver.manage().window().maximize();
		//set time implicitly 20 sec
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='test.txt']")).click();

		
		
		
	}

}
