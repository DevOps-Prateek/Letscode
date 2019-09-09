
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ad_Home extends Base {
	
	WebElement loginid;
	WebElement password;
	WebElement loginbutton;
	WebDriver driver;
	

	@BeforeTest
	public void initilize() throws FileNotFoundException, IOException, InterruptedException {
		Ad_Home ad = new Ad_Home();
		driver = ad.setenvironment();
			}
	
	@Test()
	
	public void LoginTest() throws FileNotFoundException, IOException, InterruptedException {
	System.out.println("Pass");

	}

}
