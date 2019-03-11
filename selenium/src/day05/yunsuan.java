package day05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yunsuan
{
	@DataProvider(name="add")
	@Test(timeOut=2000)
	public Object[][] data() throws InterruptedException
	{
		Thread.sleep(3000);
		return new Object[][]{{"20","40"},{"20","40"},{"20","40"}};
	}
/*		@Test(dataProvider="add")
	@Parameters({"data","data1"})
public void add(String data,String data1)
	{
		System.out.println(data+data1);
	}
	@Test(dataProvider="add")
	@Parameters({"data","data1"})
	public void add1(String data,String data1)
	{
		System.out.println(data+data1);
	}
	@Test(dataProvider="add")
	@Parameters({"data","data1"})
	public void add2(String data,String data1)
	{
		System.out.println(data-data1);
	}
	@Test(dataProvider="add")
	@Parameters({"data","data1"})
	public void add3(String data,String data1)
	{
		System.out.println("data*data1");
	}*/
}
