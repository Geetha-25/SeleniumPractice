package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvancedDirective extends Login
{
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
	driver.findElement(By.xpath("//div[@id='directives']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='directives']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='moduleType']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select[1]/option[1]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='directive_desc']")).sendKeys("trtg");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='moduleType']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select[1]/option[2]")).click();
	WebElement hh=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='directive_desc']"));
	hh.clear();
	hh.sendKeys("trtg");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();

	driver.findElement(By.xpath("//div[@id='directives']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[@id='assign-btn']")).click();
	driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div/div[5]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='directives']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='directives']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
	
	driver.findElement(By.xpath("//div[@id='directives']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='directives']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial video')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='directives']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='directives']//div[contains(@class,'col-xs-12 white-box')]//div[contains(@class,'col-xs-12 imodule-head')]//div//div[contains(@class,'hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1')]")).click();
	
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
	//driver.findElement(By.xpath("")).click();

}
}
