package SeleniumDay13_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotKeyboardDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		Thread.sleep(5000);

		Actions act = new Actions(driver);

		WebElement labelUsername = driver.findElement(By.xpath("//label[text()='Username']"));

		act.doubleClick(labelUsername).build().perform();

		Thread.sleep(5000);
		
		Robot robot = new Robot();
		
		// ctrl + c
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - Virtual key
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		// tab
		robot.keyPress(KeyEvent.VK_TAB); 
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		
		// ctrl + v
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - Virtual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
