package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Procedure extends Login{
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
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='add-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='codeType']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'CPT')]")).click();
	WebElement yy=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
yy.sendKeys("fddd");
	WebElement yy1=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='description']"));
yy1.sendKeys("fg");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='codeType']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'SNOMED CT')]")).click();
	WebElement yy3=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	yy3.clear();
	yy3.sendKeys("fddd");
		WebElement yy4=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='description']"));
	yy4.clear();
		yy4.sendKeys("fg");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='assign-btn']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1]")).click();

driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='assign-btn']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")).click();
driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[contains(@class,'col-xs-12 form-horizontal form-pop')]//div[contains(@class,'col-xs-12 form-pop-head')]//div//span[@id='del-btn']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("//div[@id='goals']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='help-btn']//a[@class='icon-color']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
	
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]/span[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();

	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//a[contains(@class,'icon-color')]//span[contains(text(),'Procedure Code')]")).click();
	driver.findElement(By.xpath("//div[@id='hospitalCode']//span[@id='popup-cancel-btn']")).click();

	
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//a[contains(@class,'icon-color')]//span[contains(text(),'Past Procedure')]")).click();
	driver.findElement(By.xpath("//div[@id='old']//span[@id='cancel-btn']")).click();

	//Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='procedure']//div[contains(@class,'col-xs-12 imodule-head')]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//ul[contains(@class,'hidden-print')]")).click();
/*	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();*/

	



}
}