package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement findElement = driver.findElement(By.name("email"));
	findElement.sendKeys("abcdefghji");
	
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys("123456");
	
	WebElement findElement3 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement3.click();
}
}
