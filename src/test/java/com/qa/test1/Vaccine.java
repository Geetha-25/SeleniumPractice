package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vaccine extends Login {
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


		driver.findElement(By.xpath("//div[@id='vaccine']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='date-type']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Reminder Date')]")).click();
	WebElement jj=	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
		jj.clear();
		jj.sendKeys("2000-05-05");
	

	WebElement hh=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='vaccine-cvx']"));
	hh.sendKeys("JJ");
	WebElement kk=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='vaccineName']"));
	kk.sendKeys("HHH");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='status']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Active')]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	//driver.findElement(By.xpath("")).click();
	WebElement error=driver.findElement(By.xpath("//div[@id='--message--']"));
	String gg=error.getText();
	 System.out.println(gg);
	 WebElement jj1=	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
		jj1.clear();
		jj1.sendKeys("2021-05-05");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='date-type']")).click();
		
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Taken')]")).click();
		 WebElement jj2=	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
			jj2.clear();
			jj2.sendKeys("2021-05-05");
			driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
			WebElement error1=driver.findElement(By.xpath("//div[contains(text(),'Taken date to be current or past date')]"));
			String gg1=error.getText();
			 System.out.println(gg1);
			 WebElement jj3=	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
				jj3.clear();
				jj3.sendKeys("2019-04-04");
				driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
				Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='row-data']//div[@id='val']//div[@id='text']//div//div[@id='desc-text']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@id='vaccine']//div[@class='col-xs-12 white-box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[@id='s-label']//input[@id='search-string']")).sendKeys("rgs");
		driver.findElement(By.xpath("//div[@id='assign']//div[@id='row-data']//span[@id='select']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='vaccine']//div[@class='col-xs-12 white-box']")).click();
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]")).click();
		
		  Thread.sleep(5000);
		
	driver.findElement(By.xpath("html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		Thread.sleep(3000);
		
	/*	driver.findElement(By.xpath("//div[@id='vaccine']//div[@class='col-xs-12 white-box']")).click();
		driver.findElement(By.xpath("/div[@id='vaccine']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']/div[@id='vaccine']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-md icon-color fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']" )).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();*/
}
}
