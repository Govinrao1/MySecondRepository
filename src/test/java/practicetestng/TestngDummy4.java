package practicetestng;

import org.testng.annotations.Test;

public class TestngDummy4 
{
	public int i=1;
	@Test(invocationCount=5, invocationTimeOut=20000)
	public void method() throws Exception
	{
	     System.out.println(i);
	     i++;
	     Thread.sleep(4000);
	}
}
