package com.selen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("http://demo.automationtesting.in/Alerts.html");
	drive1.manage().window().maximize();
	WebElement simple = drive1.findElement(By.xpath("//button[@class='btn btn-danger']"));
	simple.click();
	
	Thread.sleep(1000);
	
	Alert simplealert = drive1.switchTo().alert();
	simplealert.accept();
	
	drive1.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	drive1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);
	
	drive1.switchTo().alert().accept();
	
	
	Thread.sleep(2000);
	 drive1.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
	 
	 drive1.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Thread.sleep(2000);
	Alert alert = drive1.switchTo().alert();
	alert.sendKeys("sambath");
	Thread.sleep(2000);
	alert.accept();
	drive1.switchTo().defaultContent();
	drive1.close();
	
	
	
	
	
	
	
	
	
	
}
}
