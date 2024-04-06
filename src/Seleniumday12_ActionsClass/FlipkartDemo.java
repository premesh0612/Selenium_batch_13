package Seleniumday12_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(5000);
		
		WebElement tabElectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		act.moveToElement(tabElectronics).build().perform();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
