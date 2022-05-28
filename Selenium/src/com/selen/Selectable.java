package com.selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("http://www.leafground.com/pages/selectable.html");
	
	List<WebElement> selectable = drive1.findElements(By.xpath("//*[@id='selectable']/li"));
	
	Actions a = new Actions(drive1);
	/*a.keyDown(Keys.CONTROL).click(selectable.get(0))
	.click(selectable.get(1)).click(selectable.get(2)).perform();*/
	
	a.clickAndHold(selectable.get(0)).moveToElement(selectable.get(2)).release().perform();

	
}
}
