package SeleniumDay1_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumInstallation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		// webdriver.gecko.driver
		// webdriver.ie.driver
		
		WebDriver driver = new ChromeDriver(); // run time polymorphisdm

		driver.get("file:///C:/Users/Lenovo/eclipse/java-2022-09/offlinewebsite/OfflineWebsite/index.html");
		
		Assert.assertTrue(false);
	}

}
