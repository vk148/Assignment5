package com.victor.DevOps.Assignment5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	@Test
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Completing Assignment 5");
		driver.get("http://13.233.75.90:3001/");
		String x = driver.getTitle();
	    System.out.println(x);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.className("v-button")).click();
		driver.findElement(By.name("login")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		//driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
		//driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
		//driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
		driver.findElement(By.name("click")).click(); 
		System.out.println(driver.findElement(By.name("hello")).getText());
		Assert.assertTrue(driver.findElement(By.name("hello")).getText().contains("Login Succeeded"));
		// Thread.sleep(5000); 
		
		//driver.quit(); 
	}
}