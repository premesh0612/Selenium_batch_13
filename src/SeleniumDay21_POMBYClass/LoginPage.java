package SeleniumDay21_POMBYClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass{
	
	private WebElement textBoxUsername = driver.findElement(By.xpath("//input[@id='email']"));
	
	private WebElement textBoxPassword = driver.findElement(By.xpath("//input[@id='password']"));
	
	private WebElement buttonSignIn = driver.findElement(By.xpath("//button[@type='submit']"));

	public void Login(String email,String password) {
		textBoxUsername.sendKeys(email);
		textBoxPassword.sendKeys(password);
		buttonSignIn.click();
	}
	
	
}
