package SeleniumDay11_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHighlightDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.gmail.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);

		WebElement emailtextBox = driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));

		// background: yellow - use to hightlight background
		// border: 2px solid red - highlight border

//		js.executeScript("arguments[0].setAttribute('style','background: yellow');", emailtextBox);    

//		js.executeScript("arguments[0].setAttribute('style','border: 4px solid red');", emailtextBox);  

		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red');",
				emailtextBox);

		Thread.sleep(8000);

		driver.close();
	}

}
