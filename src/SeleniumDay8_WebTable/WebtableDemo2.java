package SeleniumDay8_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input.form-control[placeholder='Password']"));

		password.sendKeys("123456");

		WebElement signInButton = driver.findElement(By.cssSelector(".btn"));

		signInButton.click();

		Thread.sleep(5000);
		
		WebElement usertab = driver.findElement(By.xpath("//span[text()='Users']"));
		
		usertab.click();
		
		Thread.sleep(5000);
		
		List<WebElement> alHeadings = driver.findElements(By.xpath("//table/tbody/tr/th"));
		
		for(int i=0; i<alHeadings.size();i++) {
			String value = alHeadings.get(i).getText();
			System.out.println(i+ " table heading is: "+value);
		}
		
		
		driver.close();

	}
}
