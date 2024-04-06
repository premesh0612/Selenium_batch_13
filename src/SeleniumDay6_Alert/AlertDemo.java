package SeleniumDay6_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid1']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.dismiss();
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.accept();
		
		alert1.accept();
		
		
		System.out.println("Completed.");
		
		driver.close();


	}

}
