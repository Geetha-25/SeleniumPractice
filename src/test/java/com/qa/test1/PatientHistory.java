package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PatientHistory extends Login {
	
	@Test(priority=1)
	public void Patient() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='social-history']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='social-history']//div[@class='col-xs-12']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Smoking Status')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Former smoker')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='from-date']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Jan')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1902')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')][contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Heavy tobacco smoker')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Never smoker')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("In EHR social history,Selected the smoking status and also mentioned the description");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Current every day smoker')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Unknown if ever smoked')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Smoker, current status unknown')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[contains(@class,'icon-color fa fa-times')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Light tobacco smoker')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the smoking status description into never smoker,former smoker,heavy tobacco smoker,current someday smoker etc.");
		
		
		
		
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Tobacco')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into tobacco and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Alcohol')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into Alcohol and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Medication')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into Medication and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Food')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into Food and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Divorced')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into Divorced and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Widowhood')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into widowhood and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Unemployed')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into unemployed and also mentioned its description.");
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='habitType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//option[contains(text(),'Other')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//textarea[@id='longDescription']")).sendKeys("qq");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form-pop-up-body']//div[@id='save-btn']")).click();
		System.out.println("Then changed the Social history into other and also mentioned its description.");
		
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
		System.out.println("After checked the all possibilities ,Social History is deleted");


		
		

		

}
}