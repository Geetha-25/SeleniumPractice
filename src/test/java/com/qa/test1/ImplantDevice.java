package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ImplantDevice extends Login {
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
	//driver.findElement(By.id("implantable-devices")).click();
	//driver.findElement(By.id("add-btn")).click();
	driver.findElement(By.xpath("//div[@id='implantable-devices']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='implantable-devices']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
	WebElement kk=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='udi']"));
	kk.sendKeys("(01)00844588003288(17)141120(10)7654321D(21)10987654d321");
	
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='verify-btn']")).click();
	WebElement kk1=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/div[2]/div[5]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]"));
	kk1.clear();
	kk1.sendKeys("2000-05-02");
	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='deviceactive']")).click();
	WebElement kk2=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='deviceNote']"));
	kk2.sendKeys("jjgh");
	driver.findElement(By.xpath("//div[@id='verified']//span[@class='fa fa-check']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	
	
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/div[2]/div[5]/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='verified']")).click();
	WebElement kk3=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='udi']"));
	kk3.sendKeys("(01)00643169007222(17)160128(21)BLC200461H");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='verify-btn']")).click();
	//driver.findElement(By.xpath("//div[@id='row-data']//input[@id='deviceactive']")).click();
	driver.findElement(By.xpath("//div[@id='verified']//span[@class='fa fa-check']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/div[2]/div[5]/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]")).click();
	//driver.findElement(By.cssSelector("#del-btn")).click();*/
	
}
}