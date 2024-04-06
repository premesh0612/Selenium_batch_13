package SeleniumDay19_Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 3;

	@Override
	public boolean retry(ITestResult arg0) { // ITestResult --> to listen the result - fail
		if (counter < retryLimit) { // 0<3
			counter++; // 1
			return true; // re-execution
		}
		return false; // no need to perform re-execution
	}

}
