package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterized {
	
	WebDriver driver;
	
	@BeforeSuite
	private void openFacebook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
	}
	
	@Test
	@Parameters({"username" ,"password"})
	private void login(String username,String password) {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);

	}
}
