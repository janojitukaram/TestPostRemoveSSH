package testngtestcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("test case finished");
	
	}
	
	

}
