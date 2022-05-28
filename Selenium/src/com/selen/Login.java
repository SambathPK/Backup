package com.selen;

public class Login extends Baseclass{
public static void main(String[] args) {
	browserLaunch("chrome");
	FacebookPom fs = new FacebookPom(driver);
	driver.get("https://www.facebook.com/");
	sendKeyss(FacebookPom.getemail(),"sampath");
	sendKeyss(FacebookPom.getpass(),"adsada");
	click(FacebookPom.getlogin());
	
}
}
