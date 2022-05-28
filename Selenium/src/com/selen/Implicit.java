 jjnhb package com.selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://www.facebook.com/");
	drive1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement findElement = drive1.findElement(By.name("email"));
	findElement.sendKeys("assdafdss");
	
}
}
