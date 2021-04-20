package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logo extends Login {

	@Test
	public void LogoUpdate() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//td[text()='Settings']")).click();
		driver.findElement(By.xpath("//button[text()='Delete Logo']")).click();
		Thread.sleep(3000);
		System.out.println("Doctor old Logo was deleted.");
		driver.findElement(By.xpath("//button[contains(text(),'Set Logo')]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\selenium\\FileUpload.exe");
		Thread.sleep(3000);
		System.out.println("New Doctor logo was updated.");
		driver.findElement(By.xpath("//button[text()='Delete Logo']")).click();
		Thread.sleep(3000);
		System.out.println("This doctor logo also deleted.");
		driver.findElement(
				By.xpath("//label[@class='col-xs-2 text-left switch enable-head']//span[@class='slider1 round1']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Set Logo')]")).click();
		System.out.println("Finally,New Doctor logo Was successfully updated.");

		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\selenium copy\\logo.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Delete Signature']")).click();
		Thread.sleep(3000);
		System.out.println("Doctor old Logo was deleted.");
		driver.findElement(By.xpath("//button[text()='Set Signature']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\selenium copy\\Sign.exe");
		Thread.sleep(3000);
		System.out.println("New Doctor logo was updated.");
		driver.findElement(By.xpath("//button[text()='Delete Signature']")).click();
		Thread.sleep(3000);
		System.out.println("This doctor logo also deleted.");
		driver.findElement(By.xpath("//button[text()='Set Signature']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\selenium copy\\signature.exe");

		System.out.println("Finally,New Doctor logo Was successfully updated.");
		driver.close();

	}
}
