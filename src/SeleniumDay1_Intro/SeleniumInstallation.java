package SeleniumDay1_Intro;



import org.testng.Assert;

public class SeleniumInstallation {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");

		System.out.println("Premesh git and github");
		
		Assert.assertTrue(false);
	}

}
