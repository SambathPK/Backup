package com.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class Action {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sampath\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
	WebDriver drive1 =new ChromeDriver();
	
	drive1.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwxOCRBhA8EiwA0X8hi7-BdOI9WPUaRmsLQZtIGkp6ohu60RHBEaY9bh9nfIdxJHBiWuWc8BoCQcAQAvD_BwE");
	WebElement men = drive1.findElement(By.xpath("//a[@data-group='men']"));
	
	Actions as = new Actions(drive1);
	as.moveToElement(men).perform();
	
	WebElement tshirt = drive1.findElement(By.linkText("Formal Shirts"));
	as.moveToElement(tshirt).perform();
	
	JavascriptExecutor js= (JavascriptExecutor) drive1;
	js.executeScript("arguments[0].click();",tshirt);
	
}
}
