package SeleniumDay21_POMBYClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage extends BaseClass{

	private WebElement textBoxUserName = driver.findElement(By.xpath("//input[@id='username']"));

	private WebElement textBoxMobile = driver.findElement(By.xpath("//input[@id='mobile']"));

	private WebElement textBoxEmail = driver.findElement(By.xpath("//input[@id='email']"));

	private WebElement radioButtonGender = driver.findElement(By.xpath("//input[@id='Male']"));

	private WebElement dropDownState = driver.findElement(By.xpath("//select[@class='form-control']"));

	private WebElement textBoxPassword = driver.findElement(By.xpath("//input[@id='password']"));

	private WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));

	public void fillForm(String username, String mobile, String email,String state, String password) {
		textBoxUserName.sendKeys(username);
		textBoxMobile.sendKeys(mobile);
		textBoxEmail.sendKeys(email);
		radioButtonGender.click();
		selectvaluefromDropdown(dropDownState,state);
		textBoxPassword.sendKeys(password);
		buttonSubmit.click();
		alertAccept();
	}
}
