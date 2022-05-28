package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MuliSelect {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	drive1.get("http://www.leafground.com/pages/Dropdown.html");
	
	WebElement multi = drive1.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
	Select s = new Select(multi);
	
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	s.deselectByIndex(1);
	
	}
}
