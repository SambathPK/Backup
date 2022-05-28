package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://www.facebook.com/");
	drive1.findElement(By.linkText("Create New Account")).click();
	
	
	Thread.sleep(4000);
	WebElement day = drive1.findElement(By.xpath("//select[@name='birthday_day']"));
	
	
	Select s = new Select(day);
	s.selectByValue("9");
	Thread.sleep(4000);
	s.selectByIndex(2);
	Thread.sleep(4000);
	s.selectByVisibleText("10");
	
	
}
}
