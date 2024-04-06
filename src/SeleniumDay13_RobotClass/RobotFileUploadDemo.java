package SeleniumDay13_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotFileUploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://blueimp.github.io/jQuery-File-Upload/");

		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']"));
		
		button.click();
		
		Thread.sleep(5000);
		
		// copy to clipboard
		StringSelection stringselection = new StringSelection("C:\\Users\\YOGA\\Desktop\\CLass\\JS.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - Virtual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
