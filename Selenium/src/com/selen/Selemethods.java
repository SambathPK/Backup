package com.selen;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selemethods {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 driver.navigate().to("https://www.instagram.com/?hl=en");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.manage().window().maximize();
	 driver.navigate().refresh();
	 
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 
	 String windowHandle = driver.getWindowHandle();
	 System.out.println(windowHandle);
	 
	 Set<String> windowHandles = driver.getWindowHandles();
	 System.out.println(windowHandles);
	 
	 driver.close();
	 driver.quit();
	 
}
}
