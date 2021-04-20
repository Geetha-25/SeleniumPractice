package com.qa.test1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert1 extends Login {

	@Test(priority=1)
	public void AddAlert() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='alert']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='alert']//div[@id='add-btn']")).click();
		System.out.println("In EHR,Alert is added ");
		WebElement hh=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='alertDesc']"));
		hh.sendKeys("demo");
		System.out.println("And then mentioned the patient alert");
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='visibility']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Doctors')]")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='row-data']//option[@id='only-to-me']")).click();
		
		Thread.sleep(3000);
		System.out.println("changed the visibity to doctor,and changed into only me and again changed into everyone");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@class='form-group']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();
		System.out.println("After saved that alert, then edited the previous alert ");
		WebElement hh1=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='alertDesc']"));
		hh1.clear();
		hh1.sendKeys("gg");
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='visibility']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Everyone')]")).click();
		
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@class='form-group']//div[@id='save-btn']")).click();
		System.out.println("Saved that alert");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='del-btn']")).click();
		System.out.println("After checked the alert,alert is deleted");
		
	}

	
	

	
}
