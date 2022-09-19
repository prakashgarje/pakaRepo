package com.excel;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Testexcel1 {
	
	
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
	@Test
	  public void f() throws Exception {
		  fi=new FileInputStream("E:\\Selenium\\Projects\\Selenium1Proj\\TestData\\Book1.xls");
		  w=Workbook.getWorkbook(fi);
		  s=w.getSheet("Sheet1");
		  for(int i=1;i<s.getRows();i++) {
			  driver.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
			  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
			  driver.findElement(By.name("submit")).click();
			  try {
				  driver.findElement(By.linkText("Logout")).isDisplayed();
				  System.out.println("Valid credintials");
				  driver.findElement(By.linkText("Logout")).click();
			  }catch(Exception e) {
				  System.out.println("Invalid crediential");
			  }
			  
			  }
		  }
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test running");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://www.seleniumbymahesh.com/HMS/");
			driver.manage().window().maximize();
	  }

	
  }


