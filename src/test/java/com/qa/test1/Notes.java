package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Notes extends Login{
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
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 imodule-head']")).click();
		
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();;
		driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='deliveryNote']")).sendKeys("sr");
		driver.findElement(By.xpath("//div[@id='row-data']//span[@class='hover icon-md fa fa-star-o']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='deliveryNote']")).clear();
		driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='deliveryNote']")).sendKeys("srdfsd");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
		
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial videos')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='delivery-note']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
		
		//driver.findElement(By.xpath("")).click();
		//driver.findElement(By.xpath(""))
		
		/*	driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));*/
		
		
		
		
	}

}
