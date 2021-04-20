package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FamilyHealth extends Login{

	@Test(priority=1)
	public void Patient() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='family-health']//div[@class='col-xs-12 imodule-head']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='family-health']//div[@class='col-xs-12']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
		//driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Father')]")).click();
	    WebElement ele=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	    ele.sendKeys("demo");
	
	//	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//span[@class='caret']")).click();
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Notes')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']")).sendKeys("gg");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
		
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Mother')]")).click();
		WebElement ele1=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		ele1.clear();
	    ele1.sendKeys("demo1");
	WebElement yy=    driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//textarea[@id='description']"));
	yy.clear();
	yy.sendKeys("demo");
	    driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Spouse')]")).click();
		WebElement ele2=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		ele2.clear();
	    ele2.sendKeys("desc");
	    driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Brother')]")).click();
	    WebElement ele3=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	    ele3.clear();
	    ele3.sendKeys("demo1");
	    driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Sister')]")).click();
		 WebElement ele4=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele4.clear();
		    ele4.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Son')]")).click();
	    WebElement ele5=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	    ele5.clear();
	    ele5.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Daughter')]")).click();
		 WebElement ele6=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele6.clear();
		    ele6.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Niece')]")).click();
		 WebElement ele7=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele7.clear();
		    ele7.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Nephew')]")).click();
		 WebElement ele8=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele8.clear();
		    ele8.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Half Brother')]")).click();
		 WebElement ele9=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele9.clear();
		    ele9.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Half Sister')]")).click();
		 WebElement ele10=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele10.clear();
		    ele10.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Grandfather')]")).click();
		 WebElement ele11=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele11.clear();
		    ele11.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Grandmother')]")).click();
		 WebElement ele12=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele12.clear();
		    ele12.sendKeys("hhhh");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Aunt')]")).click();
		 WebElement ele13=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele13.clear();
		    ele13.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
	    driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='row-data']//select[@id='relationship']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Uncle')]")).click();
		 WebElement ele14=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
		 ele14.clear();
		    ele14.sendKeys("demo1");
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']")).click();
		  driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
		//  driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Notes')]")).click();
		  Thread.sleep(3000);
			Actions actions = new Actions(driver);
			WebElement elementLocator = driver
					.findElement(By.xpath("//div[@id='row-data']//div[@id='remove-search']"));
			actions.doubleClick(elementLocator).perform();

		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		/*driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();*/
}
}
