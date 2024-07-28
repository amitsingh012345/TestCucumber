package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchC {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
		
		
	}
	}



