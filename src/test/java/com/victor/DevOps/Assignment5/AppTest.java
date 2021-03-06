package com.victor.DevOps.Assignment5;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAppSuccess()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Completing Assignment 5");
		driver.get("http://52.66.208.9:3001/");
		String x = driver.getTitle();
	    System.out.println(x);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("click")).click(); 
		System.out.println(driver.findElement(By.name("hello")).getText());
		Assert.assertTrue(driver.findElement(By.name("hello")).getText().contains("Login Succeeded"));
		driver.quit();
    }
    
    @Test
    public void testAppFail()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Completing Assignment 5");
		driver.get("http://52.66.208.9:3001/");
		String x = driver.getTitle();
	    System.out.println(x);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user2");
		driver.findElement(By.name("click")).click(); 
		System.out.println(driver.findElement(By.name("hello")).getText());
		Assert.assertTrue(driver.findElement(By.name("hello")).getText().contains("Login Failed!"));
		driver.quit();
    }
}
