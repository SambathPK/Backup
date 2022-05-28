package com.selen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String options) {
		if (options.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      return driver;
	}
	public static void sendKeyss(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
}
