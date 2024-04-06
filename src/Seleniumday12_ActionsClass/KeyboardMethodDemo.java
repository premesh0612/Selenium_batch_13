package Seleniumday12_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement labelUsername = driver.findElement(By.xpath("//label[text()='Username']"));
		
		act.doubleClick(labelUsername).build().perform();
		
		Thread.sleep(5000);
		
		// ctrl + c
		act.keyDown(Keys.CONTROL).build().perform(); // press
		act.sendKeys("c").build().perform(); // press + release
		act.keyUp(Keys.CONTROL).build().perform(); // release
		
		act.sendKeys(Keys.TAB).build().perform(); // tab press + release
		// act.keyDown(Keys.TAB).build().perform();
		// act.keyUp(Keys.TAB).build().perform(); 
		
		Thread.sleep(5000);
		
		// ctrl + v
		act.keyDown(Keys.CONTROL).build().perform(); // press
		act.sendKeys("v").build().perform(); // press + release
		act.keyUp(Keys.CONTROL).build().perform(); // release
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
