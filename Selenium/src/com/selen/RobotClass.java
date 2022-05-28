package com.selen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://www.facebook.com/");
	drive1.manage().window().maximize();
	
	WebElement userName = drive1.findElement(By.xpath("(//input[@type='text'])[1]"));
	userName.sendKeys("Sambath");
	
	Actions a = new Actions(drive1);
	a.doubleClick(userName).perform();
	a.contextClick(userName).perform();
	
	
	Thread.sleep(5000);
	
	Robot r = new Robot();
	
	for (int i = 1; i <=8; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	

	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
}
}
