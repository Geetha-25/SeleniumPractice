package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.base;

public class tests2 extends tests1{

	@BeforeSuite
	public void befsuite2()
	{
		System.out.println("before suite2");
	}
	@AfterSuite
	public void aftsuite2()
	{
		System.out.println("After suite2");
	}
	
	@BeforeTest
	public void befTest2()
	{
		System.out.println("before Test2");
	}
	@AfterTest
	public void afTest2()
	{
		System.out.println("after Test2");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	@BeforeMethod
	public void befMethod2()
	{
		System.out.println("before method2");
	}
	
	@AfterMethod
	public void aftMethod2()
	{
		System.out.println("after method2");
	}
	
}
