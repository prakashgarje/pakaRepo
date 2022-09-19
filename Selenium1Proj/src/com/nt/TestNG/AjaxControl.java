package com.nt.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxControl {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  Thread.sleep(5000);
	 String str1= driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
	 System.out.println(str1);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test running");
  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
  }

 

}
