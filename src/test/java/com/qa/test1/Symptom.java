package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Symptom extends Login{
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
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='add-btn']")).click();
	WebElement yy1=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	 yy1.sendKeys("gg");
	 WebElement yy2=driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//textarea[@id='description']"));
	 yy2.sendKeys("fgf");
	WebElement yy=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[3]/div[1]/div[2]/div[5]/div[1]/input[1]"));
	yy.clear();
	yy.sendKeys("2000-05-05");
	
	driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	WebElement yy3=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	 yy3.sendKeys("gg");
	 driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='save-btn']")).click();
	 
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		
	driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='assign-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='s-label']//input[@id='search-string']")).sendKeys("wer");
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='select']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='current']//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='help-btn']//a[contains(@class,'icon-color')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//a[contains(@class,'icon-color')]//span[contains(text(),'Past Cured Symptom')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'imodule-body')]//div//div[@id='old']//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='symptom']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
	//driver.findElement(By.xpath("")).click();
}
}
