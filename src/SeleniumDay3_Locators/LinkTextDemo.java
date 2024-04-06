package SeleniumDay3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
		WebElement register = driver.findElement(By.linkText("Register a new membership"));
		
		register.click();
		
		Thread.sleep(5000);
		
		WebElement already = driver.findElement(By.partialLinkText("I have"));
		
		already.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
