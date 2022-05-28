package com.selen;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://letcode.in/table");
	
	List<WebElement> header = drive1.findElements(By.xpath("//table[@id='simpletable']/thead/tr/th"));
	for (WebElement headers : header) {
		System.out.println(headers.getText());
		
	}
	System.out.println("=======================================");
	
	WebElement findElement = drive1.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[2]/td[4]"));
	findElement.click();
	
	
/*	List<WebElement> lastName = drive1.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[2]"));
	List<WebElement> tick = drive1.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[4]"));
	
	for (int i = 0; i < 3; i++) {
		if (lastName.get(i).getText().equalsIgnoreCase("Raj")) {
			WebElement present = tick.get(i);
			present.click();
		
		}else {
			System.out.println("222222222222222222222");
		}
		
	}*/
			
		}
	}
		
		
	
	
		
	


	
	


