package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("http://demo.automationtesting.in/Register.html");
	WebElement findElement = drive1.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	findElement.click();
	drive1.quit();
	
	
	
}
}
