package SeleniumDay14_AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		Thread.sleep(5000);
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn1']"));
		
		button1.click();
		
		Thread.sleep(8000);
		
		WebElement textBox1 = driver.findElement(By.xpath("(//input[@id='txt1'])[1]"));
		
		textBox1.sendKeys("Ignisyst");
		
		driver.close();
	}

}
