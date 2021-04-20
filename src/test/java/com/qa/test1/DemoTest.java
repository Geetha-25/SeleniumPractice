package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void sum()
	{
		 System.out.println("HI kaaspro");
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		  driver.get("https://www.75health.com/");
			 driver.findElement(By.xpath("//input[@id='userLoginId']")).sendKeys("h");
			 driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("h");
			 driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']")).click();
			 System.out.println("SignIn verified");
	}
	

}
