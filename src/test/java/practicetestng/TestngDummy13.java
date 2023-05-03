package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy13
{
	@Test(priority=1,groups={"smoketest"})
	public void method1()
	{
		System.out.println("hi");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,groups= {"smoketest"})
	public void method2()
	{
		System.out.println("hi");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnGroups={"smoketest"})
	public void method3()
	{
		System.out.println("bye");
		Assert.assertTrue(false);
	}
}
