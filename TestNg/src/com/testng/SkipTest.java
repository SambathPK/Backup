package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SkipTest {
WebDriver driver;
    
    @Test(priority = 1,enabled = false)
	private void openFacebook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
	}
    
    @Test(priority = 0)
	private void openInstagram() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://www.instagram.com/?hl=en");

	}
    
    @Test(priority = 2)
    @Ignore
	private void openAmazon() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");

	}
    
    @Test(priority = 3)
    private void openTwitter() {
    	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://twitter.com/i/flow/login");

	}

}
