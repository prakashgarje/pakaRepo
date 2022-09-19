package com.nt.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownFacebook {
	WebDriver driver;
	WebElement month_dropdown;
  @Test
  public void selectDDValues() {
	  driver.findElement(By.linkText("Create New Account")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test running");
  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
  }
}
