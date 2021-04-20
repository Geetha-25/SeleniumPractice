package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
	
	public String driverpath="C:\\selenium\\chromedriver.exe";
	public WebDriver driver;
	
@Test
  public void SignUpTest() {
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.75health.com/create-account.jsp");
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("kh");
	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("h");
 driver.findElement(By.xpath("//input[@id='userLoginId']")).sendKeys("geethanjalig525@gmail.com");
	
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+91 8838009595");
	  driver.findElement(By.xpath("//input[@id='terms']")).click();
	WebElement ff= driver.findElement(By.xpath("//span[text()='Create Account']"));
	  ff.click();
	WebElement error=driver.findElement(By.xpath("//div[@id='errmsg']"));
	String gg=error.getText();
	 System.out.println(gg);
  }
  

  
  }
  
  

