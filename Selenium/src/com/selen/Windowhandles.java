 
package com.selen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
		WebDriver drive1 =new ChromeDriver();
		
		drive1.get("http://www.leafground.com/pages/Window.html");
		String first = drive1.getWindowHandle();
		System.out.println(first);
		
		WebElement gmail = drive1.findElement(By.id("home"));
		gmail.click();
		
		Set<String> allwindows = drive1.getWindowHandles();
		System.out.println(allwindows);
		 
		String currentUrl = drive1.getCurrentUrl();
		System.out.println(currentUrl);
		
		List<String> li = new ArrayList<String>(allwindows);
		drive1.switchTo().window(li.get(1));
		
		String currentUrl1 = drive1.getCurrentUrl();
		System.out.println(currentUrl1);
		
		drive1.close();
		drive1.switchTo().window(li.get(0));
		String currentUrl2 = drive1.getCurrentUrl();
		System.out.println(currentUrl2);
		
		
		
		
		
	}
}
