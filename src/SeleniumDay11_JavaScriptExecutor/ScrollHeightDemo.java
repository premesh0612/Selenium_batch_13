package SeleniumDay11_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHeightDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // down casting
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		// document.body.scrollHeight - scroll till bottom of the page
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
