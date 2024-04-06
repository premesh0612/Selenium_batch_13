package SeleniumDay14_AutoIt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn1']"));
		
		button1.click();
		
		WebElement textBox1 = driver.findElement(By.xpath("(//input[@id='txt1'])[1]"));
		
		textBox1.sendKeys("Ignisyst");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
