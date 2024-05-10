package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("***** test case started "+result.getName());
		

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("***** test case success "+result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("***** test case failed "+result.getName());

	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("***** test case skipped "+result.getName());

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}


	public void onTestFailedWithTimeout(ITestResult result) {
	}


	public void onStart(ITestContext context) {

	}


	public void onFinish(ITestContext context) {
		System.out.println("***** test case ended "+context.getName());

	}
	
	
	

}
