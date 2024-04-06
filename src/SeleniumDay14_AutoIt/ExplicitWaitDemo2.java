package SeleniumDay14_AutoIt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		WebDriverWait wait = new WebDriverWait(driver, 10); // seconds format

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shubham");

		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9988776655");

		driver.findElement(By.id("email")).sendKeys("shubham@gmail.com");

		driver.findElement(By.id("Male")).click();

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));

		dropdown.selectByIndex(2);

		driver.findElement(By.id("password")).sendKeys("12345");

		driver.findElement(By.id("submit")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		Alert al = driver.switchTo().alert();

		al.accept();

		System.out.println("Test completed");

		driver.close();

	}

}
