package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class forms extends Login{
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
		
		driver.findElement(By.xpath("//div[@id='custom-form']//div[@class='col-xs-12 white-box']")).click();
		driver.findElement(By.xpath("//div[@id='custom-form']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[4]/div[1]/div[1]/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='row-form']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='body-form']//div[@id='label']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[3]/div[5]/div[1]/div[2]/div[4]/div[3]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[2]//td[2]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='body-form']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[2]/div[1]/div[1]/span[1]")).click();
	
		driver.findElement(By.xpath("//body/div/div/div/div/div/table/tbody/tr/td/div/div/div/div/div/div/div/div/div/div/div/div[4]/div[3]/div[1]/div[1]/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='row-form']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='row-form']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//div[@id='custom-form']//div[@class='col-xs-12 white-box']//div[@class='imodule-body']//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
		/*driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();*/
		
		

}
}
