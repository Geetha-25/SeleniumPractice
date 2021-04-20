package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Cart extends Login {
/*protected WebDriver driver;
	
	String url = "https://35.202.203.201/";

@Test(priority=0)
	public void login() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			WebElement obj = driver.findElement(By.id("userLoginId"));
			obj.sendKeys("new@h.com");
			WebElement obj1 = driver.findElement(By.id("currentPassword"));
			obj1.sendKeys("1");
			WebElement obj2 = driver.findElement(By.xpath("//div[@class='col-xs-10 center-cont']"));
			obj2.click();
			Thread.sleep(4000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}*/
	@Test(priority=1)
	public void f1() throws InterruptedException, IOException {
Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath(
				"//div[@id='hlist_patient']//div[@class='container white-box']//div[@id='patient-name']//div[@class='col-xs-12']//div[@class='col-xs-12']//div[@id='regular-search']//table//tbody//tr//td//div[@class='col-xs-12']//input[@id='patientPartyName'] "));
		name.sendKeys("Sara");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//div[@id='3233421']//div[@class='col-xs-12 hidden-md hidden-lg visible-hlist-patient']//table[@class='table-fixed']//tbody//tr//td//div//img"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")).click();
	WebElement tt=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='personSearch']"));
	tt.click();
	//driver.findElement(By.xpath("")).click();
	Thread.sleep(3000);
	tt.sendKeys("siva");
	driver.findElement(By.xpath("//span[contains(text(),'Siva Kumar(Anesthesiology, Cardiovascular Disease,')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div//div[@id='row-data']//div[@id='save-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='row-data']//span[@id='edit-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
	}
	
	@Test(priority=2)
	public void f2() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")).click();
				Thread.sleep(3000);
		
		WebElement tt1=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='personSearch']"));
		tt1.click();
		
	Thread.sleep(3000);
		tt1.sendKeys("new@h.com");
		driver.findElement(By.xpath("//span[contains(text(),'Siva Kumar(Anesthesiology, Cardiovascular Disease,')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div//div[@id='row-data']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='row-data']//span[@id='edit-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();

}
	
	@Test(priority=3)
	public void f3() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")).click();
				Thread.sleep(3000);
		
		WebElement tt1=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='personSearch']"));
		tt1.click();
		
	Thread.sleep(3000);
		tt1.sendKeys("309-7463");
		driver.findElement(By.xpath("//span[contains(text(),'Siva Kumar(Anesthesiology, Cardiovascular Disease,')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div//div[@id='row-data']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='row-data']//span[@id='edit-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();

}
	@Test(priority=4)
	public void f4() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")).click();
				Thread.sleep(3000);
		
		WebElement tt1=	driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='personSearch']"));
		tt1.click();
		
	Thread.sleep(3000);
		tt1.sendKeys("89663322");
		driver.findElement(By.xpath("//span[contains(text(),'Siva Kumar(Anesthesiology, Cardiovascular Disease,')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div//div[@id='row-data']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='row-data']//span[@id='edit-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-12']//div//div[@id='current']//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();

}
	
	
	
	
	
	
	
}