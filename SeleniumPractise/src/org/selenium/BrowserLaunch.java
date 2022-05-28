package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Sampath\\eclipse-workspace\\SeleniumPractise\\Browser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	driver.quit();
}
}
