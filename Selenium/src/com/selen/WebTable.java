package com.selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	List<WebElement> findElements = drive1.findElements(By.xpath("(//table[@id='product'])[1]"));
	for (WebElement table : findElements) {
		System.out.println(table.getText());
	}
	
	System.out.println("=========================");
	
	List<WebElement> findElements2 = drive1.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
	for (WebElement header : findElements2) {
		System.out.println(header.getText());
	}
	WebElement findElement = drive1.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[1]"));
	System.out.println(findElement.getText());
	
	System.out.println("============");

	List<WebElement> findElements3 = drive1.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/td[3]"));
	for (WebElement datas : findElements3) {
		System.out.println(datas.getText());
	}
	}
	
}

