package practicetestng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy14TextFile
{
	@DataProvider(name="textfiledata")
	public Object[][] method1() throws Exception
	{
		Object[][] data=new Object[5][4]; //as per data in text file
		File f=new File("src\\test\\resources\\datafiles\\logintestdata.txt");
		FileReader fr=new FileReader(f); //take read permission
		BufferedReader br=new BufferedReader(fr); //get that file from HDD to RAM
		//get values line by line up to last line
		String line;
		int i=0; //in arrays, index starts with 0
		while((line=br.readLine())!=null) 
		{
			String[] pieces=line.split(",");
			int j=0;
			//store all pieces into data array
			for(String piece:pieces)
			{
				data[i][j]=piece;
				j++; //next column
			}
			i++;//next row
		}
		br.close();
		fr.close();
		return(data);
	}
	
	@Test(dataProvider="textfiledata")
	public void method2(String x, String y, String z, String p)
	{
		String w=x+"-"+y+"-"+z+"-"+p;
		System.out.println(w);
	}
}
