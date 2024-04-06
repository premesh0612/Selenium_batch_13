package SeleniumDay14_AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://blueimp.github.io/jQuery-File-Upload/");

		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']"));
		
		button.click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Selenium\\AutoItUploadFile.exe");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
