package SeleniumDay20_DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	@Parameters({"BrowserName"})
	public void OpenBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "exe file");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "exe file");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
