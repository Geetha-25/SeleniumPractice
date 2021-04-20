package com.qa.test1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Problem extends Login {

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
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='add-btn']")).click();
	WebElement yy=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	yy.sendKeys("rtr");
	WebElement yy1=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/div[4]/div[1]/div[2]/div[5]/div[1]/input[1]"));
	yy1.clear();
	yy1.sendKeys("2000-05-05");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	WebElement yy2=driver.findElement(By.xpath("//div[@id='row-data']//textarea[@id='longDescription']"));
	yy2.clear();
	yy2.sendKeys("rtr");
	driver.findElement(By.xpath("//div[@id='row-data']//div[@class='form-pop-body']//div[@id='save-btn']")).click();
	
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
	driver.findElement(By.xpath("//div[@id='s-label']//input[@id='search-string']")).sendKeys("sdf");
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='select']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath(" /html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Help')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath(" /html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//span[contains(text(),'Tutorial Video')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'form-pop-head col-xs-12 bg-danger')]//span[@id='cancel-btn']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath(" /html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//a[contains(@class,'icon-color')]//span[contains(text(),'Past Cured Problems')]")).click();
	driver.findElement(By.xpath("//div[@id='old']//span[@id='cancel-btn']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath(" /html[1]/body[1]/div[4]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[42]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'kpull-right hidden-print hover-content open')]//li[@id='print-btn']//a[contains(@class,'icon-color')]")).click();
	//driver.navigate().back();
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ESCAPE).build().perform();
	
	
	
	
	/*//driver.findElement(By.xpath("//div[contains(text(),'fdf')]")).click();
	//driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 imodule-head']")).click();
	driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 white-box']//div[@class='col-xs-12 imodule-head']//div//div[@id='assign-btn']")).click();
//	WebElement nn=driver.findElement(By.xpath("//div[@id='diagnosis']//div[@class='col-xs-12 white-box']//div[@class='imodule-body']//div//div[@id='assign']//div[@id='row-data']//span[@id='select']"));
	//nn.sendKeys("sdf");
	//nn.click();
	driver.findElement(By.xpath("//div[contains(text(),'dfgfdg')")).click();
	//driver.findElement(By.xpath("//div[@id='row-data']//span[@id='edit-btn']")).click();
	//driver.findElement(By.xpath("//div[@id='row-data']//div[@id='form']//div[@class='col-xs-12 form-horizontal form-pop']//div[@class='col-xs-12 form-pop-head']//div//span[@id='del-btn']")).click();
*/
	}
}