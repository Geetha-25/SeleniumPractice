package com.qa.test1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Allergy extends Login {



	@Test(priority = 1)
	public void Salt() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
	//	driver.findElement(By.xpath("//div[@id='3371691-ele']//div[@id='status-color']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='allergy']//div[@class='col-xs-12 imodule-head']")).click();
		driver.findElement(By.xpath("//div[@id='allergy']//div[@id='add-btn']")).click();
		// driver.findElement(By.xpath("//div[@id='allergy']//div[@class='col-xs-12']//div[@class='col-xs-12
		// imodule-head']//div//div[@id='add-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='codeType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Food Allergy')]")).click();
		WebElement gg = driver.findElement(By.xpath("//div[@id='row-data']//input[@id='longDescription']"));
		gg.sendKeys("gggg");
		WebElement gg1 = driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longaDescription']"));
		gg1.sendKeys("gggg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//button[contains(text(),'More')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Notes')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='alnotes']//textarea[@id='description']"))
				.sendKeys("hh");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[@id='row-data']//div[@id='alnotes']//div[@id='remove-search']")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//button[contains(text(),'More')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Severity')]"))
				.click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='severity']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Mild')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Very mild')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Moderate')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Severe')]")).click();
		// driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//button[contains(text(),'More')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'Status')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='status']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Inactive')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Active')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//button[contains(text(),'More')]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btn-group dropup open']//span[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//div[@id='onset-date']//input[@type='text']")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'2000')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		;
		driver.findElement(By
				.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']"))
				.click();
		// driver.findElement(By.xpath("")).click();
		System.out.println(
				"In allergy , Selected the allergy type,allergen and its reaction .And also mentioned the severity,status,notes,started date");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='codeType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Medication Allergy')]")).click();
		WebElement kk = driver.findElement(By.xpath("//div[@id='row-data']//input[@id='longDescription']"));
		kk.sendKeys("gggg");
		driver.findElement(By
				.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']"))
				.click();
		System.out.println("changed the allergy type into medication allergy and mentioned the allergen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//select[@id='codeType']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//option[contains(text(),'Other Allergies')]")).click();
		WebElement kkk = driver.findElement(By.xpath("//div[@id='row-data']//input[@id='longDescription']"));
		kkk.sendKeys("gggg");
		driver.findElement(By
				.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']"))
				.click();
		System.out.println("Again,changed the allergy type into other allergies and also mentioned the allergen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();

		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver
				.findElement(By.xpath("//div[@id='row-data']//div[@id='alnotes']//div[@id='remove-search']"));
		actions.doubleClick(elementLocator).perform();

		Thread.sleep(3000);
		Actions actions1 = new Actions(driver);
		WebElement elementLocator1 = driver
				.findElement(By.xpath("//div[@id='row-data']//div[@id='alseverity']//div[@id='remove-search']"));
		actions1.doubleClick(elementLocator1).perform();

		// Thread.sleep(3000);
		Actions actions2 = new Actions(driver);
		WebElement elementLocator2 = driver
				.findElement(By.xpath("//div[@id='row-data']//div[@id='alstatus']//div[@id='remove-search']"));
		actions2.doubleClick(elementLocator2).perform();

		Thread.sleep(3000);
		Actions actions3 = new Actions(driver);
		WebElement elementLocator3 = driver
				.findElement(By.xpath("//div[@id='row-data']//div[@id='alonsetdate']//div[@id='remove-search']"));
		actions3.doubleClick(elementLocator3).perform();

		driver.findElement(By
				.xpath("//div[@class='col-xs-12']//div[@id='row-data']//div[@class='col-xs-12']//div[@id='save-btn']"))
				.click();
		System.out.println("Then ,removed the status,note,severity,date from allergy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='edit-btn']")).click();

		driver.findElement(By.xpath("//div[@class='col-xs-12']//div[@id='row-data']//span[@id='del-btn']")).click();

		System.out.println("Finally,after checked all the possibilities allergy is deleted");
	}
}
