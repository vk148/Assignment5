package com.victor.DevOps.Assignment5;
import org.openqa.selenium.chrome.ChromeDriver;

public class verfiytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\vijay\\Training\\edureka\\Selenium\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.edureka.co");
       String x = driver.getTitle();
       System.out.println(x);
	}

}