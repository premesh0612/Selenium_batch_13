package SeleniumDay7_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input.form-control[placeholder='Password']"));

		password.sendKeys("123456");

		WebElement signInButton = driver.findElement(By.cssSelector(".btn"));

		signInButton.click();

		Thread.sleep(5000);

		List<WebElement> links = driver.findElements(By.xpath("//a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String attribute = links.get(i).getAttribute("href");
			System.out.println(attribute);
		}

		links.get(4).click();

		Thread.sleep(5000);

		driver.close();

	}

}
