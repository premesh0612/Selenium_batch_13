package SeleniumDay4_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='email']"));
		
		usernameTextBox.sendKeys("kiran@gmail.com");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
