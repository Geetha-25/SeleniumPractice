package TestNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resource.base;

@Listeners(TestNG.ListenerTest.class)	
public class IOS extends base {

	@Test(groups={"smoke"})
	public void iosChrome() throws IOException
	{
		System.out.println("IOS chrome");


	}

	
	@Parameters({"url"})
	@Test
	public void iosFirefox(String url)
	{
		System.out.println(url);
		
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] data= new Object[3][2];
		data[0][0]="Karnataka";
		data[0][1]="Bangalore";
		
		data[1][0]="Assam";
		data[1][1]="dispur";
		
		data[2][0]="Tamilnadu";
		data[2][1]="Chennai";
		return data;
		
	}
	@Test(dataProvider="getdata")
	public void iosMultipleData(String States,String Capitals )
	{
		System.out.println(" Few States and capitals of India-" + States   +" "+  Capitals);
	}
}
