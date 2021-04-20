package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientUpdate extends Login {
	@Test(priority = 2)
	public void f1() throws InterruptedException, IOException {

		WebElement name = driver.findElement(By.xpath(
				"//div[@id='hlist_patient']//div[@class='container white-box']//div[@id='patient-name']//div[@class='col-xs-12']//div[@class='col-xs-12']//div[@id='regular-search']//table//tbody//tr//td//div[@class='col-xs-12']//input[@id='patientPartyName'] "));
		name.sendKeys("Sara");
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//div[@id='3233421']//div[@class='col-xs-12 hidden-md hidden-lg visible-hlist-patient']//table[@class='table-fixed']//tbody//tr//td//div//img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By
				.xpath("//div[@id='p-personal']//div[@class='col-xs-12']//div//span[@class='icon-color fa fa-edit hidden-print']"))
				.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//select[@id='gender']")).sendKeys("Female");
		WebElement jj = driver.findElement(By.id("birthDate1"));
		jj.clear();
		jj.sendKeys("1996-08-02");

		WebElement jjj=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-right-2']//input[@id='occupation']"));
		jjj.clear();
				jjj.sendKeys("Software engineer");
		driver.findElement(By.xpath("//select[@id='bloodGroupId']")).sendKeys("O Negative");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By
				.xpath("//div[@id='p-personal']//div[@class='col-xs-12']//div//div[@class='form-pop-body']//div[@id='save-btn']"))
				.click();
		Thread.sleep(2000);
		/*driver.findElement(By
				.xpath("//div[@class='col-xs-12 white-box sm-box-height text-center']//div[@class='col-xs-12']//div//span[@id='upload-btn']"))
				.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\selenium copy\\logo.exe");
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//div[@class='col-xs-12 white-box sm-box-height text-center']//div[@class='col-xs-12']//div//div[@id='form']//div[@class='col-xs-12 form-pop-body']//div[@id='upload-picture']//div//div//span[@class='btn btn-default btn-lg fa fa-check']"))
				.click();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//div[@class='col-xs-12']//table//div[@id='val']")).click();
		
		WebElement obj=driver.findElement(By.xpath("//div[@class='col-xs-8 col-xs-offset-right-2']//input[@id='userLoginId']"));
		obj.clear();
		obj.sendKeys("jjjj@kaaspro.com");
	WebElement obj1=	driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-right-2']//input[@id='firstName']"));
	obj1.clear();
	obj1.sendKeys("sara");
	WebElement obj2=	driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-right-2']//input[@id='lastName']"));
	obj2.clear();
	obj2.sendKeys("Brown");
	WebElement obj3=	driver.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown']//input[@id='phone']"));
	obj3.clear();
	obj3.sendKeys("+918903434591");
	WebElement obj5=	driver.findElement(By.xpath("//input[@id='national-id']"));
	obj5.clear();
	obj5	.sendKeys("122");
	WebElement obj4=	driver.findElement(By.xpath("//textarea[@id='insurance-info']"));
	obj3.clear();
	obj3.sendKeys("jjj");
	driver.findElement(By.xpath("//div[@id='ipad_patient']//div[@id='name']//div[@class='row']//div[@class='col-xs-12 col-sm-6']//div[@id='person-name-email']//div[@class='col-xs-12']//div//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='family-health-patient']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']"))	.click();
	
//WebElement obj7=driver.findElement(By.xpath("//div[@id='row-data']//input[@id='fullname']]"));
//obj7.clear();
//obj7.sendKeys("hhj");
//driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("918903434591");
//Select ss=new Select(driver.findElement(By.xpath("//Select[@id='relationship']")));
//ss.selectByVisibleText("Spouse");
WebElement kk=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
//kk.clear();
kk.sendKeys("kkk");
WebElement jj1=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]"));
jj1.sendKeys("+918903434591");
WebElement jj2=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/div[2]/select[1]"));
jj2.sendKeys("Mother");
driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='p-address-phone']//div[@class='col-xs-12']//div//span[contains(text(),'Add')]")).click();
WebElement ww=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
ww.clear();
ww.sendKeys("ll");
WebElement qq=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/input[2]"));
qq.clear();
qq.sendKeys("ss");
WebElement nn=driver.findElement(By.xpath("//div[@id='p-address-phone']//div[@class='col-xs-12']//div//input[@id='city']"));
nn.clear();
nn.sendKeys("jjj");
WebElement gg=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));

gg.sendKeys("India");
WebElement vv=driver.findElement(By.xpath("//div[@id='p-address-phone']//div[@class='col-xs-12']//div//select[@id='stateProvinceGeoId']"));

vv.sendKeys("Tamilnadu");
WebElement yy=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/input[1]"));

yy.sendKeys("155");
	WebElement zz1=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/input[1]"));
	zz1.sendKeys("+918903434591");
	WebElement zz2=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/input[1]"));
	zz2.sendKeys("+918903434592");
	WebElement zz3=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[1]/textarea[1]"));
	zz3.sendKeys("g");
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[10]/div[1]/div[1]")).click();
	//driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']")).click();
	//WebElement bb=driver.findElement(By.xpath("//div[@id='p-care-team-member']//div[@class='col-xs-12 avoid-page-break-inside']//div[@class='col-xs-12']//div[@id='FormPopHeading']//div[@class='hCl1']//div//div[@id='add-btn']"));
	//bb.click();*/
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
WebElement yy1=		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/div[1]/textarea[1]"));
	yy1.click();
	yy1.sendKeys("New Doctor");
	WebElement vvv=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[12]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/ul[1]/li[4]/a[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1])"));
	vvv.click();
	}
}
