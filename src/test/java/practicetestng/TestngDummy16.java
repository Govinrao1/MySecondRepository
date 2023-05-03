package practicetestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDummy16
{
	@Test(priority=1)
	@Parameters({"country","firstname","lastname"})
	public void displaycountry(String c, String fn, String ln)
	{
		System.out.println(fn+" "+ln+" belongs to "+c);
	}
}
