package SeleniumDay8_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo3 {

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

		WebElement usertab = driver.findElement(By.xpath("//span[text()='Users']"));

		usertab.click();

		Thread.sleep(5000);

		List<WebElement> allrows = driver.findElements(By.xpath("//table/tbody/tr"));

		for (int i = 2; i <= allrows.size(); i++) { // i=3, 3<=5

			List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td")); // 2
			
			for(int j=1;j<=alldata.size();j++) { // j=1,1<=8
				WebElement specificData = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(specificData.getText()+" | ");
			}
			System.out.println();
		}
		driver.close();
	}

}
