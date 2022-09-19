package com.nt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMS_PR {
	
	public static WebDriver driver;
	
	public static void openURL() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
 
	public static void verifyLogin() {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      openURL();
      verifyLogin();
	}

}
