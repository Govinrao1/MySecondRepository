package practicetestng;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DummyTest4 
{
	@Test(priority=1)
	public void method2(ITestContext ct)
	{
		//Retrieving attribute value set in ITestContext
		ISuite s=ct.getSuite();
		System.out.println("Output is : "+s.getAttribute("output1"));
		System.out.println("Output is : "+s.getAttribute("output2"));
	}
}










