package SeleniumDay16_TestngAnnotation;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 5)
	public void m1() {
		System.out.println("I am in m1 method");
	}

}
