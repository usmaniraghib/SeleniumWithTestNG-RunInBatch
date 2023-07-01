package com.raghib.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgWithXmlClassOne {
	
  @Test
  public void testA() {
	System.out.println("Welcome to Selenium With TestNG Project");
	System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.quit();	
  }
  
  @Test
  public void testC() {
	  Assert.assertEquals("Gmail", "Gmail");
  }
  
  @Test
  public void testB() {
	  Assert.assertEquals("Yahoo", "Yahoo");
  }
}
 