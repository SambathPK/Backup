package com.selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("http://www.leafground.com/pages/table.html");
	
	List<WebElement> from = drive1.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[1]"));
	List<WebElement> to = drive1.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td[3]"));
	
	
	for (int i = 0; i < from.size(); i++) {
		if (from.get(i).getText().equalsIgnoreCase("handle exceptions")) {
			to.get(i).click();
		}
	}
}
}
