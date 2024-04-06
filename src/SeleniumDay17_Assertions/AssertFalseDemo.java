package SeleniumDay17_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseDemo {

	@Test
	public void verifyLoginPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
		
		driver.close();
		
		
		
	}

}
