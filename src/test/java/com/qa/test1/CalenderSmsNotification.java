package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalenderSmsNotification extends Login {
	 @Test(priority=2)
	 
	  public void calender_SMSNotification() throws InterruptedException {
		  Thread.sleep(3000);
		WebElement calender =driver.findElement(By.xpath("//div[@id='menuHospital']//td[@class='menu2 hidden-patient'][contains(text(),'Calendar')]"));
		calender.click();
	  
	
	 }
	
	
	
}