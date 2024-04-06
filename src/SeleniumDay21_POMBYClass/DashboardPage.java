package SeleniumDay21_POMBYClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BaseClass{

	private WebElement tabUser = driver.findElement(By.xpath("//span[text()='Users']"));
	
	public void clickOnUsersTab() {
		tabUser.click();
	}

	
}
