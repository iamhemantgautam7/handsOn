package handsOn.demoblaze;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	Properties prop;

	@BeforeTest
	public void initiateSetup() throws IOException {

		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//test//resources//userCred.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		fis.close();
	}

	@BeforeMethod
	public void setup() {

		String strBrowser = prop.getProperty("browser");
		if (strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

	}

	@Test
	public void first_testCase() {

		driver.get( prop.getProperty("url"));

	}

}
