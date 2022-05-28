package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	WebDriver driver;
	
	@Test(invocationCount = 5)
	private void openFacebook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
	}
}
