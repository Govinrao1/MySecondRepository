package practicetestng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DummyTest2 
{
	public RemoteWebDriver driver;
	
	@Test(priority=1)
	public void method1()
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		System.out.println(sf.format(dt));
		System.out.println("i am method1 in class2");
	}
	
	@Test(priority=2)
	public void method2()
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		System.out.println(sf.format(dt));
		System.out.println("i am method2 in class2");
	}
}


















