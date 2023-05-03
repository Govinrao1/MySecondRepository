package practicetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy6
{
	
	@Test(priority=1)
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods={"openbrowser"})
	public void login() 
	{
		System.out.println("do login");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods={"login"})
	public void sendMail()
	{
		System.out.println("send a mail");
	}
	
	@Test(priority=4, dependsOnMethods={"openbrowser"})
	public void closebrowser()
	{
		System.out.println("browser closed");
	}
}







