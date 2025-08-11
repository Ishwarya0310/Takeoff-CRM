package listeners;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerReport implements ITestNGListener {
	

	// When Test case get Started, this method is called.	
	
	public void onTestStart(ITestResult result)					
    {	
		
    Reporter.log("This method got started"+result.getName());
    System.out.println(" test case started via listerner successfully");					
    }		

    // When Test case get passed, this method is called.		
		
    public void onTestSuccess(ITestResult result)					
    {
    Reporter.log("This method got started"+result.getName());
    System.out.println("Your Test Script is Successfully Executed");					
    }	
    // When Test case get Skipped, this method is called.		
    public void onTestFailure(ITestResult result) 					
    {	
    Reporter.log("This method got started"+result.getName());
    System.out.println("Sorry , Please check the test script its failed  ");					
    }		

  
}
