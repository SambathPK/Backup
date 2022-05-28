package com.selen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
		WebDriver drive1 =new ChromeDriver();
		
		drive1.get("https://www.facebook.com/");
		
		WebElement login = drive1.findElement(By.name("login"));
		WebDriverWait wait = new WebDriverWait(drive1, Duration.ofSeconds(10));
		
		
		WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(login));
		profile.click();
		
		
	}
}
