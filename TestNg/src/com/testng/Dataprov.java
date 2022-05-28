package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprov {
WebDriver driver;
	
	@BeforeMethod
	private void openFacebook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sampath\\eclipse-workspace\\TestNg\\Browser\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "login")
	private void login(String user,String passw) {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(user);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(passw);
		
		WebElement findElement = driver.findElement(By.name("login"));
		findElement.click();

	}
	
	String [][] data= { {"sambath","12345"},
			             {"khabib","2345"}
			           } ;

	@DataProvider(name="login")
	private String[][] Datasp() {
		 
		return data;
	}
}


