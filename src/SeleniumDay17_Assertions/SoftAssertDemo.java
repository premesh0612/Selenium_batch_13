package SeleniumDay17_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void verifyLoginPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
		SoftAssert SoftAssertObj = new SoftAssert();

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input.form-control[placeholder='Password']"));

		password.sendKeys("123456");

		WebElement signInButton = driver.findElement(By.cssSelector(".btn"));

		signInButton.click();

		Thread.sleep(5000);
		
		SoftAssertObj.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OOfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");

		System.out.println("Hi");
		
		driver.close();
		
		SoftAssertObj.assertAll();
	}

}
