package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seledemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drive2=new ChromeDriver();
		drive2.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement findElement = drive2.findElement(By.xpath("(//i[@class='icon-user left'])"));
		findElement.click();
		
		WebElement findElement2 = drive2.findElement(By.xpath("(//i[@class='icon-lock left'])"));
		findElement2.click();
		
		
	}

}
