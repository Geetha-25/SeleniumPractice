package Testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class tests1{
	@BeforeSuite
	public void befsuite1()
	{
		System.out.println("before suite1");
	}
	@AfterSuite
	public void aftsuite1()
	{
		System.out.println("After suite1");
	}
	
	@BeforeTest
	public void befTest1()
	{
		System.out.println("before Test1");
	}
	@AfterTest
	public void afTest1()
	{
		System.out.println("after Test1");
	}
	@Test
	public void test1()
	{
		System.out.println("test");
	}
	@BeforeMethod
	public void befMethod1()
	{
		System.out.println("before method1");
	}
	
	@AfterMethod
	public void aftMethod1()
	{
		System.out.println("after method1");
	}
	
}
