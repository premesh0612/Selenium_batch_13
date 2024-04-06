package SeleniumDay1_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstallation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		// webdriver.gecko.driver
		// webdriver.ie.driver
		
		WebDriver driver = new ChromeDriver(); // run time polymorphisdm

		
	}

}
