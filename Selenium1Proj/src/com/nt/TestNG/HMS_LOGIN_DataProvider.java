package com.nt.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_LOGIN_DataProvider {
	WebDriver driver;
  @Test(dataProvider = "Authentication")
  public void f(String uname, String pwd) throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Logout")).click();
  }

  @DataProvider(name="Authentication")
  public Object[][] Credentials() {
    return new Object[][] {{ "admin", "admin"},{"mahesh","mahesh"} };
      
    };
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test running");
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
  }

}
