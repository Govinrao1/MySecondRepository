package practicetestng;

import org.testng.annotations.Factory;

public class TestngDummy18
{
	@Factory
	public Object[] method() 
	{
		//Create objects to runner classes
		TestngDummy8 obj1=new TestngDummy8();
		TestngDummy9 obj2=new TestngDummy9();
		//store runner classes objects into an array
		Object[] tests=new Object[2];
		tests[0]=obj1;
		tests[1]=obj2;
		//return that array to TestNG to run listed runner classes sequentially
		return(tests);
	}
}
//OR
//use a testng suite file ex: testng5factory
