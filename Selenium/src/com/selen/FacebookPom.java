package com.selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom {
public static WebDriver driver;
 
@FindBy(id = "email")public static WebElement email ;
@FindBy(id = "pass")public static WebElement password ;
@FindBy(name = "login")public static WebElement login ;

 public FacebookPom(WebDriver driver) {
	 PageFactory.initElements(driver, this);
}
	

public static WebElement getemail() {
	
	return email;
}
public static WebElement getpass() {
	
	return password;
}
public static WebElement getlogin() {
	
	return login;
}
}
