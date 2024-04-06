package SeleniumDay10_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		
		Thread.sleep(5000);
		
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		image.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
