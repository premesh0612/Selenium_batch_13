package Seleniumday12_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement textBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement textBoxAccount = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		act.dragAndDrop(textBank, textBoxAccount).build().perform();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
