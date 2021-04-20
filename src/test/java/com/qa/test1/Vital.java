package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vital extends Login {
	
/*	protected WebDriver driver;
	
	String url = "35.202.203.201";

@Test(priority=0)
	public void login() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	}
	*/
	
	
@Test(priority=1)
	public void RespiratoryRate() throws InterruptedException
	{
		driver.findElement(By.xpath("//td[text()='Health Record']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//button[@id='newMedicalRecordButton']//span[contains(text(),'New Health Record')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Respiratory rate')]")).click();
	WebElement rr=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
	rr.sendKeys("30");
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
	System.out.println("In EHR vital, Respiratory rate is added in breaths/min ");
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
			driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
			driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
			System.out.println("Finally, Respiratory rate is deleted");
		
	}
@Test(priority=2)
	public void BloodPressure() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Blood Pressure')]")).click();
		WebElement Bp=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		Bp.sendKeys("100");
		WebElement Bp1=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result2']"));
		Bp1.sendKeys("77");
		System.out.println("In EHP,systolic and diastolic bp is added");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, Blood pressure is deleted");
	}
@Test(priority=3)
	public void glucose() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Glucose by Glucometer')]")).click();
		WebElement glu=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		glu.sendKeys("4.9");
		System.out.println("In EHP,Glucose is added mmol/L");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement glu1=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		glu1.clear();
		glu1.sendKeys("88");
		driver.findElement(By
				.xpath("//div[@id='row-data']//select[@id='select-unit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@id='mg/dL']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		System.out.println("In EHP,Glucose is added mg/dL");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement glu2=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		glu2.clear();
		glu2.sendKeys("4.8");
		driver.findElement(By
				.xpath("//div[@id='row-data']//select[@id='select-unit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@id='mmol/L']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, Glucose by glucometer is deleted");
		
	}
@Test(priority=4)
	public void OxySaturation() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Oxygen saturation')]")).click();
		WebElement oxy=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		oxy.sendKeys("80");
		System.out.println("In EHP,Oxygen Saturation is added in %");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, Oxygen Saturation is deleted");
	}
@Test(priority=5)
	public void heartRate() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Heart rate/Pulse')]")).click();
		WebElement oxy=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		oxy.sendKeys("80");
		System.out.println("In EHP,HeartRate is added in beats/min");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("HeartRate is deleted");
	}
@Test(priority=6)
	public void Temperature() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Temperature')]")).click();
		WebElement oxy=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		oxy.sendKeys("98.2");
		System.out.println("In EHP,HeartRate is added in beats/min");
		System.out.println("In EHP,Glucose is added mmol/L");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement glu1=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		glu1.clear();
		glu1.sendKeys("36.5");
		driver.findElement(By
				.xpath("//div[@id='row-data']//select[@id='select-unit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@id='deg C']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		System.out.println("In EHP,Glucose is added mg/dL");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement glu2=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		glu2.clear();
		glu2.sendKeys("98.3");
		driver.findElement(By
				.xpath("//div[@id='row-data']//select[@id='select-unit']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@id='deg F']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, Glucose by glucometer is deleted");
	
	}
@Test(priority=7)
	public void BMI() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'BMI')]")).click();
		WebElement oxy=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		oxy.sendKeys("22");
		System.out.println("In EHP,BMI is added in kg/m2");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, BMI is deleted");
	}
@Test(priority=8)
	public void Weight() throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Weight')]")).click();
		WebElement yy = driver.findElement(By.xpath(
				"//div[@id='row-data']//input[@id='result']"));
		yy.sendKeys("55");
		// div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
System.out.println("In EHR vital, weight is added in kilogram");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
		WebElement yy1 = driver.findElement(By.xpath(
				"//div[@id='row-data']//input[@id='result']"));
		yy1.clear();
		Thread.sleep(3000);
		yy1.sendKeys("60");
		driver.findElement(By.xpath("//option[@id='pounds']")).click();
		System.out.println("In EHR,New Weight is added and also kilogram is changed into pounds");
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();

		driver.findElement(By
				.xpath("//div[@id='row-data']//select[@id='select-unit']"))
				.click();
		// driver.findElement(By.xpath("//option[@id='pounds']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@id='kilograms']")).click();
		System.out.println("Again , Pound is changed into kilogram");

		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();

		driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
		driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
		System.out.println("Finally, after checked the all possibilities.weight is deleted");
	}
@Test(priority=9)
		public void height() throws InterruptedException
		{
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

			driver.findElement(By.xpath("//a[contains(text(),'Height')]")).click();
		WebElement height=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
		height.click();
		height.sendKeys("160");
		//System.out.println("In EHR,Height is added in cm");
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
		
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
			WebElement height1=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
			
			height1.clear();
			height1.sendKeys("5'00");
			driver.findElement(By.xpath("//div[@id='row-data']//select[@id='select-unit']")).click();
			driver.findElement(By.xpath("//option[@id='ft-in']")).click();
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
			
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
			WebElement height2=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
			
			height2.clear();
			height2.sendKeys("70");
			driver.findElement(By.xpath("//div[@id='row-data']//div[@class='col-xs-6']//div//select[@id='select-unit']")).click();
			driver.findElement(By.xpath("//option[@id='inches']")).click();
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
			WebElement height3=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
			
			height3.clear();
			height3.sendKeys("170");
			driver.findElement(By.xpath("//div[@id='row-data']//select[@id='select-unit']")).click();
			driver.findElement(By.xpath("//option[@id='cm']")).click();
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
			driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();

			driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
			driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
			System.out.println("Finally, after checked the all possibilities Height is deleted");
			
			
		}
@Test(priority=10)
public void heightAtAge() throws InterruptedException
{
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='add-btn']//button[@type='button']")).click();

	driver.findElement(By.xpath("//a[contains(text(),'Height at age > 25')]")).click();
WebElement height=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
height.click();
height.sendKeys("160");
//System.out.println("In EHR,Height is added in cm");
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();

	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
	WebElement height1=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
	
	height1.clear();
	height1.sendKeys("5'00");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='select-unit']")).click();
	driver.findElement(By.xpath("//option[@id='ft-in']")).click();
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
	
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
	WebElement height2=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
	
	height2.clear();
	height2.sendKeys("70");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='select-unit']")).click();
	driver.findElement(By.xpath("//option[@id='inches']")).click();
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();
	WebElement height3=	driver.findElement(By.xpath("//div[@id='row-data']//input[@id='result']"));
	
	height3.clear();
	height3.sendKeys("170");
	driver.findElement(By.xpath("//div[@id='row-data']//select[@id='select-unit']")).click();
	driver.findElement(By.xpath("//option[@id='cm']")).click();
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@class='imodule-body']//div[@id='row-data']//span[@id='edit-btn']")).click();

	driver.findElement(By.xpath("//div[@id='row-data']//i[@id='row-del-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='direct-yes-btn']")).click();
	System.out.println("Finally, after checked the all possibilities Height  at age > 25is deleted");
	
	
}

	
	
	

}
