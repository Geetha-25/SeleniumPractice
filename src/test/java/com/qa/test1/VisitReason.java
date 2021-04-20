package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VisitReason extends Login {
	
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
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='add-btn']")).click();
	WebElement hh=	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']"));
	hh.sendKeys("demo");
	
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement hh1=	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']"));
		hh1.clear();
		hh1.sendKeys("ddd");
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='row-data']//span[@id='del-btn']")).click();
	
		
		
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='assign-btn']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@id='s-label']//input[@id='search-string']")).sendKeys("ewrw");
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='row-data']//span[@id='del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='add-btn']")).click();
		WebElement hh2=	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']"));
		hh2.sendKeys("ggg");
		driver.findElement(By.xpath("//div[@id='row-data']//span[@class='hover icon-md fa fa-star-o']")).click();
		
		String uuid = UUID.randomUUID().toString();

		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='text-xmuted iD'][contains(text(),'Create New Label')]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='new-label']//span[@class='fa fa-check']")).click();
		Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='row-data']//div[@id='close']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@id='row-data']//span[@id='del-btn']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//cr-button[@class='cancel-button']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		driver.findElement(By.xpath("//div[@id='visit-reason']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']" )).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@class='hidden-patient hover icon-color icon-md fa fa-ellipsis-v dropdown-toggle dropdown-toggle1']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
			//	driver.FindElement(By.linkText("Print")).Click();
Thread.sleep(3000);
/*Runtime.getRuntime().exec("C:\\autoit\\close1.exe");
	/*	Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ESCAPE);

		r.keyRelease(KeyEvent.VK_ESCAPE);*/

	       /* Thread.sleep(3000);
	        WebElement temp = driver.findElement(By.xpath("//*[@id='block-print-ui-print-links']/div/span/a"));
	        temp.click();
	        Actions action = new Actions(driver); 
	        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);

	   

	     

	    

	      
	      
	      //  return false;

	     
	
	*/
		
		
		
		
		
		
		
	
}
}
