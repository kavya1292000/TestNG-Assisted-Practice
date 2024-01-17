package listenersDemo;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerClass implements ITestListener{
	@Override 
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test has been Invoked");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Log : Test has been successfull");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Log: Test has failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Log: Test has been skipped");
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Log: Test has been failed due to timeout");
	}	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("The Main test has started");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The Main test has Completed");
	}
	
	

	

}
