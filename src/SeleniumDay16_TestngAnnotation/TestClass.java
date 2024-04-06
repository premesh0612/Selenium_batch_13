package SeleniumDay16_TestngAnnotation;

import org.testng.annotations.Test;

public class TestClass extends BaseClass{

	@Test
	public void tc1() {
		System.out.println("i am in tc1");
	}
	
	@Test(invocationCount = 5)
	public void tc2() {
		System.out.println("i am in tc2");
	}
}
