package SeleniumDay1_Intro;



import org.testng.Assert;

public class SeleniumInstallation {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");

		
		
		Assert.assertTrue(false);
	}

}
