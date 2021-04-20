package com.qa.test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class Search extends Login {
	@Test(priority = 2)
	public void f1() throws InterruptedException {

		WebElement name = driver.findElement(By.xpath("//div[@id='hlist_patient']//div[@class='container white-box']//div[@id='patient-name']//div[@class='col-xs-12']//div[@class='col-xs-12']//div[@id='regular-search']//table//tbody//tr//td//div[@class='col-xs-12']//input[@id='patientPartyName'] "));
		name.sendKeys("Sara");
		driver.findElement(By.xpath("//div[@id='3233421']//div[@class='col-xs-12 hidden-md hidden-lg visible-hlist-patient']//table[@class='table-fixed']//tbody//tr//td//div//img")).click();
driver.findElement(By.xpath("//div[@id='menuHospital']//span[@class='fa fa-home']")).click();
driver.close();


			
		}
}
