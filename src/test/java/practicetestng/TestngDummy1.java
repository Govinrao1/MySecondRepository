package practicetestng;

import org.testng.annotations.Test;

public class TestngDummy1
{
	//way-1(Run as Java application)
	public static void main(String[] args)
	{
		System.out.println("Hi, i am main method");
	}
	
	//way-2(Run as TestNG Test)
	@Test
	public void method()
	{
		System.out.println("Hi, i am an annotated method");
	}
}
