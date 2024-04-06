package SeleniumDay21_POMBYClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddUserTestScript extends BaseClass{
	
	@Test
	public void verifyAddUser() throws InterruptedException {
		
		LoginPage LoginPageObj = new LoginPage();
		
		LoginPageObj.Login("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
		
		DashboardPage DashboardPageObj = new DashboardPage();
		
		DashboardPageObj.clickOnUsersTab();
		
		UsersPage UsersPageObj = new UsersPage();
		
		UsersPageObj.clickOnAddUser();
		
		AddUserPage AddUserPageObj = new AddUserPage();
		
		AddUserPageObj.fillForm("Prashant", "99887776655", "prashnat@gmail.com", "HP", "1234");
		
		Thread.sleep(5000);
	}

}
