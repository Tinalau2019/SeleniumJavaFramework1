package listeners1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners1 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("*****Test started : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test is successful : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test failed : " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test skipped : " + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("*****Test completed : "+context.getName());
		
	}
	

	}
	