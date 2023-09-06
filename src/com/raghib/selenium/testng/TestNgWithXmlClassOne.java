package com.raghib.selenium.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgWithXmlClassOne extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	public static String url = "https://www.google.com/";

	@Test
	public void testA() {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
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
