package SeleniumDay10_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm2");
		
		Thread.sleep(5000);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
		
		textBox.sendKeys("ignisyst");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent(); // switch to browser from frame
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
