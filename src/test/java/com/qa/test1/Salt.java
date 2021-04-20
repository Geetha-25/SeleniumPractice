package com.qa.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salt extends Login {


	
	
	
@Test(priority=1)
	public void Salt() throws InterruptedException
	{
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
/*		driver.findElement(By.xpath("//button[@id='add-past-btn']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Weight')]")).click();
		WebElement yy = driver.findElement(By.xpath(
				"//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='form-pop-body']//div[@id='formgroup1']//div[@class='col-xs-6']//div//input[@id='result']"));
		yy.sendKeys("55");
		// div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
System.out.println("In EHR vital, weight is added in kilogram");
 driver.navigate().back();
 Thread.sleep(3000);
	driver.findElement(
			By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();*/
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='current']//span[contains(text(),'SALT')]")).click();
	Thread.sleep(3000);
	driver.close();

	
	
}
}

