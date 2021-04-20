package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class referral extends Login{

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
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//input[@id='personSearch']")).click();
	//	driver.findElement(By.xpath("//a[@id='ui-id-19']//td[@id='nameh']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'hospital account')]")).click();
	    driver.findElement(By.xpath("//div[@id='refer']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 white-box']//div[@class='imodule-body']//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[8]/div[1]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 white-box']//div[@class='imodule-body']//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@class='hidden-patient icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'imodule-body')]//div//a[contains(@class,'close')][contains(text(),'×')]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@class='hidden-patient icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
		driver.findElement(By.xpath("//div[@id='refer']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@class='hidden-patient icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
		/*driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();*/
}
}
