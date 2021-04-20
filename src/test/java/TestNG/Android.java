package TestNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import log4j1.demo;

//@Listeners(TestNG.ListenerTest.class)				

public class Android {

	private static Logger log1 = LogManager.getLogger(Android.class.getName());

	public class ListenerTest {
	
	}

	@Test(groups={"smoke"})
	public void androidChrome()
	{
		log1.error("reference log4j");
		System.out.println("andriod chrome");
	}
	@Test(dependsOnMethods={"androidChrome"}, groups={"sanity"})
	public void androidFirefox()
	{
		System.out.println("android firefox");
	}
	
	@Test(enabled=false)
	public void androidUc()
	{
		System.out.println(" Android UC browser");
	}

	@Test(timeOut=4000)
	public void androidEdge()
	{
		System.out.println("android Edge");
		
	}
}
