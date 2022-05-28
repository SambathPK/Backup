;package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	drive1.get("http://demo.automationtesting.in/Frames.html");
	
	WebElement findElement2 = drive1.findElement(By.id("singleframe"));
	drive1.switchTo().frame(findElement2);
	
	WebElement findElement = drive1.findElement(By.xpath("(//input[@type='text'])[1]"));
	findElement.sendKeys("sambath");

	
	drive1.switchTo().defaultContent();
	drive1.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
	WebElement findElement3 = drive1.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])"));
	drive1.switchTo().frame(findElement3);
	
	WebElement findElement4 = drive1.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
	drive1.switchTo().frame(findElement4);
	drive1.findElement(By.xpath("(//input[@type='text'])")).sendKeys("kshdkshd");
	
	System.out.println("================================");
	
	
}
}
