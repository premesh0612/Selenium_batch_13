package SeleniumDay11_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollByDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,1000)", ""); // top to bottom
		
		// scrollBy(0,-500) - bottom to up
		// scrollBy(500,1000); scroll horizontally till 500 coordinates and vertically 1000 coordinates
		// scrollBy(500,0); - scroll horizontally 500 coordinates

		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
