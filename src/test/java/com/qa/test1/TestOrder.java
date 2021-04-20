package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOrder extends Login{

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
	
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='add-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longCommonName']")).sendKeys("hemo");
	driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='save-btn']")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[7]/div[3]/div[1]/div[3]/div[1]/div[1]")).click();
	driver.findElement(By.xpath("//b[contains(text(),'Body weight')]")).click();
	driver.findElement(By.xpath("//div[@id='row-data4']//div[@id='result-form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='form-pop-body']//div[@class='form-group']//div[@class='col-xs-6']//div//input[@id='result']")).sendKeys("160");
	driver.findElement(By.xpath("//div[@id='row-data4']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data4']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data4']//div[@id='result-form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[7]/div[3]/div[3]/div[1]/div[1]/div[2]/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[7]/div[3]/div[3]/div[1]/div[1]/div[2]/span[1]")).click();
	
	
	
	//help
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='help-btn']//a[@class='icon-color']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	//tutorial cideo
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
	//graph result
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Graph Result')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='old']//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Past Test Order')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='old']//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//a[contains(@class,'icon-color')]//span[contains(text(),'Test Code')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='hospitalCode']//span[@id='popup-cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Email Lab')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='emailAssign']//span[@id='assign-cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='test-order']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='test-order']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Print')]")).click();
/*	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();*/
	
	
	
	 
	 
	}
	
	
	}

