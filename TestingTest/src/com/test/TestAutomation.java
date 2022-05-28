package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Sampath\\eclipse-workspace\\TestingTest\\browser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,2000)");
	
    WebElement frame = driver.findElement(By.id("a077aa5e"));
	
	driver.switchTo().frame(frame);
	
	WebElement imgsrc = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	imgsrc.click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	List<String> li = new ArrayList<String>(windowHandles);
	
	driver.switchTo().window(li.get(1));
	System.out.println(driver.getCurrentUrl());
	
	WebElement testing = driver.findElement(By.cssSelector("svg.kadence-svg-iconset.svg-baseline"));
	
	
	
	Select s = new Select(testing);
	s.selectByVisibleText("JUnit");
	

	
	
}
}
