package SeleniumDay19_Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript {
	
	@Test(retryAnalyzer = SeleniumDay19_Listener.RetryAnalyzerImplementation.class)
	public void tc1() {
		System.out.println("Hi I am in tc1");
		Assert.assertTrue(true); // 1
	}
	
	@Test(retryAnalyzer = SeleniumDay19_Listener.RetryAnalyzerImplementation.class)
	public void tc2() {
		System.out.println("Hi I am in tc2");
		Assert.assertTrue(false); // 1 + 3 = 4
	}

}

// Total test: 5, failure:1, skip:0
// Total test: 2, failure:1, skip:0, retries: 3
