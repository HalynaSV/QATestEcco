package com.halyna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOlxSite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver");
		
		WebDriver driverFireFox01 = new FirefoxDriver();
		
		openPage(driverFireFox01);
		
		driverFireFox01.close();
		

	}
	
	
	// Open site page
	public static void openPage(WebDriver pDriver) {
		pDriver.get("https://olx.pl");
		
		System.out.println(pDriver.getTitle());
	}
	

}
