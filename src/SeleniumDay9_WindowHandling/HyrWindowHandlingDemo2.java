package SeleniumDay9_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyrWindowHandlingDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentWidnow = driver.getWindowHandle();
		System.out.println(parentWidnow);
		System.out.println("========================================================");

		WebElement button3 = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", button3);

		button3.click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String s : allWindows) {
		
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.hyrtutorials.com/p/basic-controls.html")) {
				driver.manage().window().maximize();
				Thread.sleep(5000);
				WebElement firstnameTextBox = driver.findElement(By.id("firstName"));
				firstnameTextBox.sendKeys("ignisyst@gmail.com");
				Thread.sleep(5000);
			}
		}
		
		driver.quit();
	}
}
