package com.selen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScrshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://www.amazon.in/");
	TakesScreenshot scrshot= (TakesScreenshot) drive1;
	File src = scrshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\Screenshots\\img1.png");
	FileUtils.copyFile(src, dest);
	
}
}
