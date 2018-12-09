package com.halyna.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase01 {
	
    WebDriver driver = new FirefoxDriver();
    
    public void run() {
    	
    	driver.get("https://olx.pl");
        
    	
    	
        driver.close();
	
    }
    
    

}
