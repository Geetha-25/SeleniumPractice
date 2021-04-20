package Lit;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import li.Li;
import resource.base;

public class listen extends base{
public WebDriver driver;
	@BeforeTest
	public void inti() throws IOException
	{
		driver=IntializeDriver();
	}
	
	@Test
	public void inti1()
	{
		Li l=new Li(driver);
		l.s().click();
		//Assert.assertTrue(false);
		
	}
	@AfterTest
	public void inti2(){
		driver.quit();
	}
}
