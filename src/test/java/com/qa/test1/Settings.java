package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Settings extends Login {

	

	@Test
	public void SettingsTest() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//td[text()='Settings']")).click();
		driver.findElement(By.xpath("//button[text()='Manage your Account']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("In settings,Manage your account is verified");
		driver.findElement(By.xpath("//button[contains(@onclick,'setting.changep()')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("In Settings, Change password is verified");
		driver.findElement(By.xpath("//button[contains(@onclick,'setting.userList()')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("In Setting,manage users is verified");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Delete Logo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Set Logo')]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\selenium\\FileUpload.exe");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Delete Signature']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Set Signature']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\selenium copy\\Sign.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//button[@id='auto-logout-time']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='1 Hour']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Hospital Service Charges/ Tax')]"))
				.sendKeys("Hospital Service Charges/ Tax");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Clinical Decision Support')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Set Favorites')]")).sendKeys("Set Favorites");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Hospital Codes')]")).sendKeys("Hospital Codes");
		// driver.findElement(By.xpath("//button[@id='form-script']")).sendKeys("Set
		// Forms");
		driver.findElement(By.xpath("//button[@id='date-format']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='yyyy-MM-dd']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='edit-print-preference']")).click();
		Thread.sleep(3000, 2000);
		driver.findElement(By.xpath("//div[@class='col-xs-6 text-right']//button[@id='save-btn']")).click();
		Thread.sleep(2000);
		System.out.println("Application settings is verified");
		driver.findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Subscription is  Verified");
		driver.findElement(By.xpath("//button[@id='report-by']")).sendKeys("Weekly");
		driver.findElement(
				By.xpath("//label[@class='col-xs-2 text-left switch notify-checkbox']//span[@class='slider1 round1']"))
				.click();
		System.out.println("Reports verified");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[@id='menu-account']")).click();
		driver.findElement(By.xpath("//div[@id='menu-application']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menu-payments']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menu-reports']")).click();
		Thread.sleep(2000);

	}
}
