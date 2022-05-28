package com.selen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://adactin.com/");
	drive1.manage().window().maximize();
	
	//WebElement down = drive1.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	JavascriptExecutor js= (JavascriptExecutor) drive1;
	//js.executeScript("window.scroll(0,1000);", "");
	
	
	//js.executeScript("windows.scrollTo(0,-1000);", "");
	
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	
	
	//js.executeScript("window.scrollBy(0,0)");
	
	WebElement down = drive1.findElement(By.xpath("//span[@style='color: #82c9ff; font-size: 46px;']"));
	
	js.executeScript("arguments[0].scrollIntoView();", down);
	Thread.sleep(5000);
	WebElement up = drive1.findElement(By.xpath("(//img[@alt='Adactin'])[1]"));
	js.executeScript("arguments[0].scrollIntoView();", up);
	
	
	//Robot r=new Robot();
	//r.keyPress(KeyEvent.VK_PAGE_UP);
	//r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	
}
}
