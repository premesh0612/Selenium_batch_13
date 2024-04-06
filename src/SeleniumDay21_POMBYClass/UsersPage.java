package SeleniumDay21_POMBYClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends BaseClass {

	private WebElement buttonAdduser = driver.findElement(By.xpath("//button[text()='Add User']"));

	public void clickOnAddUser() {
		buttonAdduser.click();
	}
}
