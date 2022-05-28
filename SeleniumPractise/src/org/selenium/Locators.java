package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Sampath\\eclipse-workspace\\SeleniumPractise\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Sampath");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Pablo");
	
	driver.navigate().to("https://www.google.com/");
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Messi");
	
	driver.navigate().to("https://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("asdfgh");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("szdgfzfgzg");
}
}
