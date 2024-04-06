package SeleniumDay11_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,1000)", ""); // top to bottom
		
		WebElement homeButton = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		
		WebElement subscribeButton = driver.findElement(By.xpath("//input[@name='subscribe']"));
		
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='EMAIL']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", homeButton);
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", subscribeButton);

		Thread.sleep(5000);
		
		// arguments[0].value --> enter a value
		js.executeScript("arguments[0].value='ignisyst@gmail.com'", emailTextBox);
		
		Thread.sleep(5000);
		// arguments[0].click() - click operation
		js.executeScript("arguments[0].click()", subscribeButton);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
