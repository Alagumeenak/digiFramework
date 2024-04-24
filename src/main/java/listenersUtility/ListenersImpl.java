package listenersUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;

public class ListenersImpl extends BaseClass implements ITestListener{
	

	@Override
	 public void onTestStart(ITestResult result) {
	    // not implemented
	System.out.println(result.getName()+"execution started");  
	}
	
	@Override
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		System.out.println(result.getName()+"execution completed Com");
		  }
	public void onTestFailure(ITestResult result) {
	    // not implemented
	test.log(LogStatus.FAIL, test.addScreenCapture(getWebPageScreenshot(driver)));
	}
	public void onTestFinish(ITestContext context) {
		System.out.println("execution finish");
	}
	 
}
