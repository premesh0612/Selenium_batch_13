package SeleniumDay7_FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownOptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		List<WebElement> allOptions = driver.findElements(By.xpath("//option"));
		
		System.out.println("total number of options: "+allOptions.size());
		
		Iterator itr = allOptions.iterator();
		
		while(itr.hasNext()) {
			WebElement wb = (WebElement) itr.next();
			
			String text = wb.getAttribute("value");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("HP")) {
				wb.click();
				Thread.sleep(5000);
			}
		}
		
		driver.close();
	}

}
