import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Base {
	

	Properties prop;
    WebDriverWait wait;
    
    WebElement loginid;
	WebElement password;
	WebElement loginbutton;
	
	
public static void main(String[] args) {
	

    	 
    	
    
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayuri.Pawar\\Desktop\\Chromedriver\\chromedriver.exe" );
         	WebDriver driver = new ChromeDriver();
         	driver.manage().window().maximize();
         	driver.close();

		 
}
		 

    	
    	
    		 
    		 
    			
    		 
    	 }
    	 
    	 
    	
    	

    	
    }
	
	


