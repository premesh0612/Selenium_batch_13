package SeleniumDay16_TestngAnnotation;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority = 1)
	public void cmethod() {
		System.out.println("cmethod");
	}
	
	@Test(priority = 2)
	public void amethod() {
		System.out.println("amethod");
	}
	
	@Test(priority = 3)
	public void bmethod() {
		System.out.println("bmethod");
	}

}
