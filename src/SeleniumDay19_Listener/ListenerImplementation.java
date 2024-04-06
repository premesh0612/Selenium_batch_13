package SeleniumDay19_Listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("On finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("On Start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("On Test FailedBut within sucess percentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		String methodname = arg0.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Selenium\\Screenshots\\"+methodname+".png");
		
		try {
			FileUtils.copyFile(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On Test skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("On Test Start");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On Test Success");
		
	}

}
