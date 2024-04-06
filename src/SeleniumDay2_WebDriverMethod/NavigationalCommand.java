package SeleniumDay2_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html"); // open application url in browser

		Thread.sleep(5000); // use to add a pause in execution
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back(); // backward operation
		
		Thread.sleep(5000);
		
		driver.navigate().forward(); /// forward operation
		
		Thread.sleep(5000);
		
		driver.navigate().refresh(); // refresh operation
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
