package TestNG;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pof.Login_pof;

import li.Li;
import resource.base;

public class listen123 extends base{
public WebDriver driver;
	@BeforeTest
	public void intializing() throws IOException
	{
		driver=IntializeDriver();
	}
	
	@Test
	public void intialise123()
	{
		Login_pof	login_tc = new Login_pof(driver);
		//Li l=new Li(driver);
		login_tc.SignIn();
		//Assert.assertTrue(false);
		
		
	}
	@AfterTest
	public void inti2(){
		driver.quit();
	}
}
