package SeleniumDay3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("123456");
		
		WebElement signInButton = driver.findElement(By.tagName("button"));
		
		signInButton.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
