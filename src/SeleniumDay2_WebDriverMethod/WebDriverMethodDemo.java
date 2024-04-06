package SeleniumDay2_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html"); // open application url in browser

		String pagetitle = driver.getTitle(); // use to fetch a page title
		System.out.println("Title of the page is: "+pagetitle);
		
		if(pagetitle.equals("AdminLTE 2 | Log in")) {
			System.out.println("User naviagates to the login page");
		}
		
		String url = driver.getCurrentUrl(); // use to fetch a current page url
		System.out.println("URL of the current page is: "+url);
		
		String source = driver.getPageSource();
		System.out.println("Source of the current page is: "+source);
		
		driver.close(); // use to close a browser
	}

}
