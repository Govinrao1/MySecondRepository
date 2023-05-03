package practicetestng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerBodies implements ITestListener
{
	SimpleDateFormat sf;
	Date dt;
	
	public void onFinish(ITestContext Result) 					
    {		
		Reporter.log("Thank you, bye for now");
    }		
	
    public void onStart(ITestContext Result)					
    {		
    	System.out.println("Welcome, please go to reports");
    }
    
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)			
    {	
    	Reporter.log("Test passed within expected success percentage");
    }		

    public void onTestFailure(ITestResult Result)				
    {		
    	sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
    	dt=new Date();
    	Reporter.log(Result.getName()+" Test failed on "+sf.format(dt));
    }		
    
    public void onTestSkipped(ITestResult Result)					
    {		
    	sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
    	dt=new Date();
    	Reporter.log(
    		"The name of the testcase Skipped is :"+Result.getName()+" at "+sf.format(dt));			
    }		

    public void onTestStart(ITestResult Result)					
    {		
    	sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
    	dt=new Date();
    	Reporter.log(Result.getName()+" test case started at "+sf.format(dt));					
    }		
	
    public void onTestSuccess(ITestResult Result)					
    {		
    	Reporter.log("The name of the testcase passed is :"+Result.getName());			
    }		
}
