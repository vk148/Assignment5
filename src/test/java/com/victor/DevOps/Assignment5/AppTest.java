package com.victor.DevOps.Assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppSuccess()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Completing Assignment 5");
		driver.get("http://13.233.75.90:3001/");
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
    
    public void testAppFail()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\vijay\\Training\\edureka\\Assignments\\Assignment.5\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Completing Assignment 5");
		driver.get("http://13.233.75.90:3001/");
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
