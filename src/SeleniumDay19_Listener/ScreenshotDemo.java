package SeleniumDay19_Listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Selenium\\Screenshots\\dummy.png");
		
		try {
			FileUtils.copyFile(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
