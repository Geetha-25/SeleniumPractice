package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class inpatient extends Login {
	
	@Test
	public void f() throws InterruptedException
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
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
	Thread.sleep(3000);
		//driver.findElement(By.id("admissionDate")).click();
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).sendKeys("1990-05-05");
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2019')]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();
		//driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[1]//td[4]//a[1]")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//html//body//div//div//div//div//div//table//tbody//tr//td//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//label[contains(text(),'Discharge Date')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2021')]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[1]//td[4]//a[1]")).click();
	
		driver.findElement(By.xpath("//div[@id='current']//div//select[@class='form-control medWidth']")).click();
		driver.findElement(By.xpath("//div[@id='current']//div//option[contains(text(),'Emergency')]")).click();
		driver.findElement(By.xpath("//div[@id='current']//div//input[@placeholder='ROOM NO']")).sendKeys("20");
		driver.findElement(By.xpath("//div[@id='current']//div//textarea[@id='dischargeSummary']")).sendKeys("ryt");
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 white-box']//div[@class='imodule-body']//div[@id='current']//div//div[@id='save-btn']")).click();
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//span[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//span[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
		
		driver.findElement(By.xpath("//div[@id='inpatient']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//span[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Print')]")).click();
	/*	driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		*/
		
		
		
		
		
}
}
