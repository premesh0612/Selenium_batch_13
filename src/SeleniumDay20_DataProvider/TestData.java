package SeleniumDay20_DataProvider;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="loginTestData")
	public static Object[][] login(){
		Object[][] x = {{"kiran@gmail.com","123456"},{"kirann@gmail.com","123456"},{"kiran@gmail.com","123"},{"kirann@gmail.com","123"}};
		return x;
	}
	
	@DataProvider(name="AddUsertestData")
	public static Object[][] Adduser(){
		Object[][] x = {{"kiran@gmail.com","123456","kiran","kiran@gmail.com","9988776655"}};
		return x;
	}
}
