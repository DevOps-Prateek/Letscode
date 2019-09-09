import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayuri.Pawar\\Desktop\\Chromedriver\\chromedriver.exe" );
     	WebDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.close();
	}

}
