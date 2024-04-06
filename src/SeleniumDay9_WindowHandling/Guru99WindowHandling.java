package SeleniumDay9_WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/popup.php");
		
		String parentWidnow = driver.getWindowHandle();
		System.out.println(parentWidnow);
		System.out.println("========================================================");
		WebElement clickhereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		clickhereLink.click();
		
		Set<String> childWindows = driver.getWindowHandles();
		
		Iterator itr = childWindows.iterator();
		
		while(itr.hasNext()) {
			String cwindow = (String) itr.next();
			System.out.println(cwindow);
			
			if(!parentWidnow.equalsIgnoreCase(cwindow)) {
				driver.switchTo().window(cwindow);
				WebElement textBoxEmail = driver.findElement(By.xpath("//input[@name='emailid']"));
				textBoxEmail.sendKeys("Ignisyst@gmail.com");
				Thread.sleep(5000);
				driver.close();
				Thread.sleep(5000);
			}
		}

		driver.switchTo().window(parentWidnow);
		driver.close();

	}

}
