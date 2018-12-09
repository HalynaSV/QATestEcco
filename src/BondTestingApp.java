import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BondTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "./resources/geckodriver"); 

        WebDriver driver1 = new FirefoxDriver();
  //      driver.get("https://pl.ecco.com/en-GB");
        
        loginBOND(driver1);
        
        
    }
    
    
    
    
    
    // Test case Login-to-the-BOND system 
    public static void loginBOND (WebDriver pDriver) {
    	pDriver.get("https://pl.ecco.com/en-GB");
        
    	
        pDriver.findElement(By.className("profile-icon")).click();
        String pagestatuscheck = pDriver.getCurrentUrl();
           if (pagestatuscheck.contains("https://pl.ecco.com/en-GB/My-ECCO/Login?ReturnUrl=%2FMy-ECCO"))
           {
        	   System.out.println("The Login page successfully opened ");
        	   
           }
           else {
           
        	   System.out.println("The login page is not opened");
           
           }
    
       
        pDriver.findElement(By.id("Email")).sendKeys("testinghsv1@gmail.com");
        pDriver.findElement(By.id("Password")).sendKeys("Test123)");
//        pDriver.findElement(By.className("ecco_button ecco_button--secondary-solid-black ecco_button--fullwidth")).click();
        pDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div/form/button")).click();

        
       //  pDriver.getCurrentUrl();
        System.out.println(pDriver.getCurrentUrl());
        //System.out.println(pDriver.getTitle());
        
        
    }
    
}
    


