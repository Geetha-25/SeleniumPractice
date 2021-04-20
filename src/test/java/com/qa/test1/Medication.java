package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Medication extends Login{

	@Test(priority=1)
	public void Patient() throws InterruptedException, IOException, AWTException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
		Thread.sleep(3000)
		;
		driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//input[@id='patientPartyName']")).sendKeys("Sara");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='nameh']//span[@class='text-primary'][contains(text(),'Sara Brown')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='drug']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='drug']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Zinc Oxide 100 MG')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//input[@id='STRENGTH']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//input[@id='DISP_QUANTITY']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='SIG_DIRECTIONS']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@class='hover icon-md fa fa-star-o']")).click();
		
	/*	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/div[7]/div[4]")).click();
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Show Start')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Apr')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-active')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='end-date']")).click();
		/*driver.findElement(By.xpath("")).click();*/
		
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		
		
		/*driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
	*/
		
	
}
}