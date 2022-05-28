package com.selen;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
		WebDriver drive1 =new ChromeDriver();
		
		drive1.get("https://www.facebook.com/");
		WebElement login = drive1.findElement(By.name("login"));
		
		FluentWait w = new FluentWait(drive1);
		w.withTimeout(Duration.ofSeconds(30));
		w.pollingEvery(Duration.ofSeconds(3));
		w.ignoring(NoSuchElementException.class);
		
		Object until = w.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver drive1) {
				return login;
			}
		});
		
		
		
	
		
		
		
		
		
	}
}
