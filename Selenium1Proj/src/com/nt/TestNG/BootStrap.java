package com.nt.TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BootStrap {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("i-icon-profile")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("signInLink")).click();
	  Thread.sleep(5000);
	  WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	  driver.switchTo().frame(iframe);
	  driver.findElement(By.xpath("//div[@class='facebook-text']")).click();
	  Thread.sleep(5000);
	  Set<String> windows = driver.getWindowHandles();
	  System.out.println(windows);
	  Object[] s=windows.toArray();
	  driver.switchTo().window(s[1].toString());
	  driver.findElement(By.id("email")).sendKeys("Prakash");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test running");
	  System.setProperty("webdriver.gecko.driver",
			  System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
  }

}
