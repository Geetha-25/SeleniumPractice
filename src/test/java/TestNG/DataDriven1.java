package TestNG;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.DataDriven;
import resource.base;

public class DataDriven1 {
/*	@BeforeTest
	public void intializing1() throws IOException
	{
		driver=IntializeDriver();
	}*/
	
	@Test
	public void dd() throws IOException
	{
		DataDriven dd1= new DataDriven();
	ArrayList	data=dd1.getData("premium");
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	
		
		
	}

	private void getData(String string) {
		// TODO Auto-generated method stub
		
	}

}
