package practicetestng;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DummyTest3 
{
	@Test(priority=1)
	public void method1(ITestContext ct)
	{
		int a=100;
		int b=30;
		int z=a+b;
		//Setting an attribute with name and its value at suite level
		ISuite s=ct.getSuite();
		s.setAttribute("output1",z);
		s.setAttribute("output2",z+1);
	}
}








