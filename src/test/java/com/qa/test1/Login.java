package com.qa.test1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	protected WebDriver driver;
	JavascriptExecutor jse;
	// String url = "https://75health.com/";
	String url = "https://192.168.43.252:8443";

	//String url = "https://	192.168.42.71:8443";
	 @BeforeSuite
	
	public void login() {

		try {
			System.setProperty("webdriver.chrome.driver", "/home/raju/Selenium/chromedriver");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		    Thread.sleep(3000);
			WebElement obj = driver.findElement(By.id("userLoginId"));
			obj.sendKeys("geethanjali2596@gmail.com");
			// obj.sendKeys("ususer_27@kaaspro.com");
			WebElement obj1 = driver.findElement(By.id("currentPassword"));

			obj1.sendKeys("1");
			

			 driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']")).click();
			Thread.sleep(4000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Login hh=new Login();
		hh.login();
	}
}
