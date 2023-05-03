package practicetestng;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy11
{
	@DataProvider(name="testdata")
	public Object[][] method1(ITestContext tc)
	{
		Object[][] data;
		String[] groups=tc.getIncludedGroups();
		for(String group:groups)
		{
			if(group.equalsIgnoreCase("ArithmeticOperations"))
			{
				data=new Object[][]{{"10","20"},{"30","78"}};
				return(data);
			}
			else if(group.equalsIgnoreCase("StringsManipulations"))
			{
				data=new Object[][]{{"abdul","kalam"},{"steve","jobs"}};
				return(data);
			}
			else
			{
				data=new Object[][]{{"abdul",11},{"Dhoni",34.8}};
				return(data); 
			}
		}
		return(null);
	}
	
	@Test(groups={"ArithmeticOperations"},dataProvider="testdata")
	public void numbersaddition(String x, String y)
	{
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=a+b;
		System.out.println(c);
	}
	
	@Test(groups={"ArithmeticOperations"},dataProvider="testdata")
	public void numberssubstract(String x, String y)
	{
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=a-b;
		System.out.println(c);
	}
	
	@Test(groups={"ArithmeticOperations"},dataProvider="testdata")
	public void numbersmultiply(String x, String y)
	{
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=a*b;
		System.out.println(c);
	}
	
	@Test(groups={"ArithmeticOperations"},dataProvider="testdata")
	public void numbersdivison(String x, String y)
	{
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=a/b;
		System.out.println(c);
	}
	
	@Test(groups={"StringsManipulations"},dataProvider="testdata")
	public void stringsconcat(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}
	
	@Test(groups={"StringsManipulations"},dataProvider="testdata")
	public void stringsconcatupper(String x, String y)
	{
		String z=x.toUpperCase()+y.toUpperCase();
		System.out.println(z);
	}
	
	@Test(groups={"Alphanumericmaniplations"},dataProvider="testdata")
	public void stringnumberconcat(String x, double y)
	{
		String z=x+y;
		System.out.println(z);
	}
}




