package com.qa.test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class patientCreation1 extends Login {
	@Test(priority = 2)

	public void patientCreation1() throws InterruptedException, IOException {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[46]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]")).click();
		
		WebElement firstName =	driver.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("sara");
		Thread.sleep(3000);
		
		WebElement lastName =driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("brown");
		Thread.sleep(3000);
		
		WebElement gender =driver.findElement(By.xpath("//button[@id='gender_dropdown']"));
		gender.click();
		Thread.sleep(1000);
		
		WebElement genderselect =driver.findElement(By.xpath("//a[contains(text(),'Female')]"));
		genderselect.click();
		Thread.sleep(1000);
		
		WebElement dob =driver.findElement(By.xpath("//input[@id='birthDate2']"));
		dob .sendKeys("2020-01-01");
		Thread.sleep(1000);
		
		WebElement emailid=driver.findElement(By.xpath("//input[@id='userloginId']"));
		emailid.sendKeys("gggg2@kaaspro.com");
		Thread.sleep(500);
		
		WebElement phononum=driver.findElement(By.xpath("//input[@id='userloginId']"));
		phononum.sendKeys("");
		
		WebElement create=driver.findElement(By.xpath("//div[@id='createPatient']//span[contains(text(),'Create')]"));
		create.click();
		
}
}
