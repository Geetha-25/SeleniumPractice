package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amendment extends Login {
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
	driver.findElement(By.xpath("//div[@id='alert']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='alert']//div[@id='add-btn']")).click();
	System.out.println("In EHR,Alert is added ");
	WebElement hh=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='alertDesc']"));
	hh.sendKeys("demo");
	System.out.println("And then mentioned the patient alert");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='visibility']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Doctors')]")).click();
	Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row-data']//option[@id='only-to-me']")).click();
	
	Thread.sleep(3000);
	System.out.println("changed the visibity to doctor,and changed into only me and again changed into everyone");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@class='form-group']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='del-btn']")).click();
	System.out.println("After checked the alert,alert is deleted");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='source']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Patient')]")).click();
   WebElement yy=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='notes']"));
	yy.sendKeys("demo");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='status']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Accept')]")).click();
	WebElement yy1= driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='reason']"));
	yy1.sendKeys("gg");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	//driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='source']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Referral')]")).click();
	WebElement yy2=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='notes']"));
	yy2.clear();
	yy2.sendKeys("fdtg");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='status']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Deny')]")).click();
	WebElement yy3=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='reason']"));
	yy3.clear();
	yy3.sendKeys("rt");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[6]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();

	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='help-btn']//a[@class='icon-color']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial video')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='amendment']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Print')]")).click();
	Thread.sleep(3000);
	// press Escape programmatically - the print dialog should have focus, obviously

	//Runtime.getRuntime().exec("C:\\autoit\\close2.exe");
	/*driver.findElement(By.xpath("")).click();
	
	
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();*/
	

}
}