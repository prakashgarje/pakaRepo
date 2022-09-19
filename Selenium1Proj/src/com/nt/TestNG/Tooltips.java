package com.nt.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tooltips {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	  System.out.println("no of frames:"+frames);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test running");
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
