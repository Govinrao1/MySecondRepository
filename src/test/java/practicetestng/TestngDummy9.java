package practicetestng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy9
{
	@DataProvider(name="mydata")
	public Object[][] datamethod(Method m)
	{
		Object[][] data;
		if(m.getName().equalsIgnoreCase("testmethod1"))
		{
			data=new Object[][]{{12,34,45},{21,43,65},{24,23,-65}};
			return(data);
		}
		else if(m.getName().equalsIgnoreCase("testmethod2"))
		{
			data=new Object[][]{
				{"abdul","kalam",93},{"Dhoni","MS",41},{"kohli","anushka",34}};
			return(data); 
		}
		else
		{
			data=new Object[][]{{"abdul","kalam","11"},	{"Dhoni","MS","34.8"}};
			return(data); 
		}
	}
	
	@Test(priority=1,dataProvider="mydata")
	public void testmethod1(int x, int y, int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	
	@Test(priority=2,dataProvider="mydata")
	public void testmethod2(String x, String y, int z)
	{
		String w=x+"-"+y+"-"+z;
		System.out.println(w);
	}
}




