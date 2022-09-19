package com.nt.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	    System.out.println("Test is going");
	    driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	 System.out.println("Before Test running");
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test executted");
  }

}
