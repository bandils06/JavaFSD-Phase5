package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	
	WebDriver driver;
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("noob@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345@67890");
		driver.findElement(By.name("login")).submit();
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
	
}