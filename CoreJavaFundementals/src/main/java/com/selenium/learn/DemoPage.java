package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPage {


public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.xpath("//b[text()='Admin']")).click();

JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement addBtn= driver.findElement(By.xpath("//input[@id='btnAdd' and @name='btnAdd']"));
js.executeScript("arguments[0].click()",addBtn);



//select[@id='systemUser_userType']
//input[@id ='systemUser_employeeName_empName']
//input[@name='systemUser[userName]']
//select[@id='systemUser_status']
//input[@id='systemUser_password']
//input[@id='systemUser_confirmPassword']
//input[@id ='btnSave']

WebElement user = driver.findElement(By.xpath("//select[@id='systemUser_userType']"));

Select sc = new Select(user);

 //Select userole1 = new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")));
sc.selectByIndex(1);

 WebElement ename =driver.findElement(By.xpath("//input[@id ='systemUser_employeeName_empName']"));
        ename.sendKeys("Admin A");

WebElement username =driver.findElement(By.xpath("//input[@name='systemUser[userName]']"));
       username.sendKeys("shwetrha");

 
Select status = new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
status.selectByIndex(1);


 WebElement pwd =driver.findElement(By.xpath("//input[@id='systemUser_password']"));
   pwd.sendKeys("as@123Aasdfg");
WebElement cnf =driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
  cnf.sendKeys("as@123Aasdfg");

;
WebElement bttnsave= driver.findElement(By.xpath("//input[@id ='btnSave']"));

bttnsave.click();


}


}

