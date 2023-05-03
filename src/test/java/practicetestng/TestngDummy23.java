package practicetestng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDummy23
{
	public RemoteWebDriver driver;
	public ATUTestRecorder recorder;
	public String vp;
	
	@BeforeClass
	public void method1() throws Exception
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		vp="target\\"+this.getClass().getName()+sf.format(dt); //".mov" is default extension
		recorder=new ATUTestRecorder(vp,false); //false means no audio
		recorder.start();
	}
	
	@Test(priority=1)
	public void magnitia() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.magnitia.com");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test(priority=2)
	public void gmail() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.close();
	}
	
	@AfterClass
	public void method4() throws ATUTestRecorderException
	{
		recorder.stop();
	}
}
