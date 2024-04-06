package SeleniumDay16_TestngAnnotation;

import org.testng.annotations.Test;

public class TestngDemo1 extends BaseClass{
	
	// Testng Annotation
	@Test
	public void tc1() {
		// login
		System.out.println("Hi i am in tc1");
	}
	
	@Test
	public void tc2() {
		// search
		System.out.println("Hi i am in tc2");
	}
	
	@Test
	public void tc3() {
		// logout
		System.out.println("Hi i am in tc3");
	}

}
