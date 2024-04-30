package handsOn.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void initiatBrowser() {
		driver=new ChromeDriver() ;
	}

}
