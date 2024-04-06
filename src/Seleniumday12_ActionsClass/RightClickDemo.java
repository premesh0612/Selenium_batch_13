package Seleniumday12_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement textBoxUsername = driver.findElement(By.xpath("//input[@id='username']"));
		
		act.click(textBoxUsername).build().perform();
		
		Thread.sleep(5000);
		
		act.contextClick().build().perform();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
