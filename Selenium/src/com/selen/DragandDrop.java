package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("http://www.leafground.com/pages/drop.html");
	
	WebElement from = drive1.findElement(By.id("draggable"));
	WebElement to = drive1.findElement(By.id("droppable"));
	
	Actions a = new Actions(drive1);
	//a.clickAndHold(from).moveToElement(to).release(to).build().perform();
	
	a.dragAndDrop(from, to).perform();
	
	
}
}
