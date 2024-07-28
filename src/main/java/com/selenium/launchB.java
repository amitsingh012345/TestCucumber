package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class launchB {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
	
	
}
}
