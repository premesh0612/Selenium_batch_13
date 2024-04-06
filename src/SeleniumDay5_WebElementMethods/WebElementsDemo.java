package SeleniumDay5_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='username']"));

		usernameTextBox.sendKeys("Gaurav123");

		Thread.sleep(5000);

		usernameTextBox.clear();

		Thread.sleep(5000);

		usernameTextBox.sendKeys("Gaurav");

		Thread.sleep(5000);

		String usernameAttribute = usernameTextBox.getAttribute("placeholder");

		System.out.println("Placeholder attribute value is : " + usernameAttribute);

		String tagname = usernameTextBox.getTagName();

		System.out.println("username element tag name is : " + tagname);

		WebElement mobileTextBox = driver.findElement(By.xpath("//input[@id='mobile']"));

		System.out.println(mobileTextBox.isDisplayed());

		if (mobileTextBox.isDisplayed()) {
			mobileTextBox.sendKeys("9988776655");
		}
		
		Thread.sleep(5000);

		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='email']"));

		System.out.println(emailTextBox.isEnabled());

		if (emailTextBox.isEnabled()) {
			emailTextBox.sendKeys("shubham@gmail.com");
		}
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='Male']"));
		
		System.out.println(maleRadioButton.isSelected());
		
		if(maleRadioButton.isSelected()) {
			
		}else {
			maleRadioButton.click();
		}
		
		Thread.sleep(5000);
		
		WebElement dropdownState = driver.findElement(By.tagName("select"));
		
		Select obj = new Select(dropdownState);
		
		obj.selectByVisibleText("HP");
		
		Thread.sleep(5000);
		
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@id='password']"));
		
		textBoxPassword.sendKeys("1234");
		
		Thread.sleep(5000);
		
		WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		String submitTextvalue = buttonSubmit.getText();
		
		System.out.println("Text value present on submit button: "+submitTextvalue);
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
