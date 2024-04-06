package SeleniumDay5_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		WebElement dropdownState = driver.findElement(By.tagName("select"));

		Select obj = new Select(dropdownState);

		obj.selectByVisibleText("HP");

		Thread.sleep(3000);
		
		obj.selectByValue("Punjab");
		
		Thread.sleep(3000);
		
		obj.selectByIndex(1);
		
		Thread.sleep(3000);
		
		// obj.deselectByIndex(1); // java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		
		System.out.println(obj.isMultiple()); // check dropdown is multi select or not
		
		driver.close();

	}

}
