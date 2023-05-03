package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy7
{
	@Test(priority=1,groups={"smoketest","realtest"})
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods={"openbrowser"}, groups={"smoketest","realtest"})
	public void login() 
	{
		System.out.println("do login");
	}
	
	@Test(groups={"realtest"},dependsOnGroups={"smoketest"})
	public void sendMail()
	{
		System.out.println("send a mail");
	}
}







