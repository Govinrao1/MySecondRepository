package practicetestng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy15ExcelFile
{
	@DataProvider(name="exceldata")
	public Object[][] method1() throws Exception
	{
		File f=new File("src\\test\\resources\\datafiles\\logintestdata.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi); //get my workbook 
		Sheet sh=wb.getSheetAt(0);  //get 1st sheet from workbook
		int RowNum=sh.getPhysicalNumberOfRows();   //count of Rows
		int ColNum=sh.getRow(0).getLastCellNum(); // get last ColNum 
		Object data[][]=new Object[RowNum-1][ColNum]; //array size as per count of data
		for(int i=1; i<RowNum; i++) //Loop works from 2nd row because 1st row has headings
		{  
	        for (int j=0; j<ColNum; j++) //Loop works o columns
	        {
	            try
	            {
	            	//get values as string when they are int, float, date,…etc
	            	DataFormatter df=new DataFormatter();
	            	data[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
	            }
	            catch(Exception ex)
	            {
	            	data[i-1][j]="";
	            }
	        }
		}
		fi.close();
		wb.close();
		return(data);
	}
	
	@Test(dataProvider="exceldata")
	public void method2(String x, String y, String z, String p)
	{
		String w=x+"-"+y+"-"+z+"-"+p;
		System.out.println(w);
	}
}
