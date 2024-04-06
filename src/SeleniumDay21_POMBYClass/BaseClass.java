package SeleniumDay21_POMBYClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass

	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void selectvaluefromDropdown(WebElement wb, String value) {
		Select obj = new Select(wb);
		obj.selectByVisibleText(value);
	}
	
	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
