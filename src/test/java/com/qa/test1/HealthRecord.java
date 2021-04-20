package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HealthRecord extends Login
{
@Test
public void f1() throws InterruptedException, IOException
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[text()='Health Record']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000)
;
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//input[@id='patientPartyName']")).sendKeys("Sara");
Thread.sleep(3000);
driver.findElement(By.xpath("//td[@id='nameh']//span[@class='text-primary'][contains(text(),'Sara Brown')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//input[@id='patientPartyName']")).sendKeys("3233-427");
Thread.sleep(3000);
driver.findElement(By.xpath("//td[@id='nameh']//span[@class='text-primary'][contains(text(),'Sara Brown')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//input[@id='patientPartyName']")).sendKeys("+91 77085 70139");
Thread.sleep(3000);
driver.findElement(By.xpath("//td[@id='nameh']//span[@class='text-primary'][contains(text(),'Sara Brown')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//input[@id='patientPartyName']")).sendKeys("new@p.com");
Thread.sleep(3000);
driver.findElement(By.xpath("//td[contains(text(),'+91 121 212 1212 2001-07-04 147, Old Mahabalipuram')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 hidden-patient']//div[@class='col-xs-12 col-sm-4 form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);




driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//span[@class='hover icon-md fa fa-caret-down']")).click();
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//input[@id='userPartyName']")).sendKeys("Mona lisa");
driver.findElement(By.xpath("//span[contains(text(),'Mona lisa')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//input[@id='userPartyName']")).sendKeys("311-2993");
driver.findElement(By.xpath("//span[contains(text(),'Mona lisa')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//input[@id='userPartyName']")).sendKeys("+913535353535");
driver.findElement(By.xpath("//span[contains(text(),'Doctor User')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//input[@id='userPartyName']")).sendKeys("new@h.com");
driver.findElement(By.xpath("//span[contains(text(),'Siva Kumar')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-4 hidden-patient form-group']//div//span[@class='hover icon-md fa fa-times-circle']")).click();





driver.findElement(By.xpath("//button[@id='report-btn']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@id='s-date-created']//span[contains(text(),'Date Created')]")).click();
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'This Month')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Past Month')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Today')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Yesterday')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Custom Date')]")).click();
WebElement ee=driver.findElement(By.xpath("//div[@id='row']//div[@id='fromDate']"));
ee.click();

driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
driver.findElement(By.xpath("//option[contains(text(),'Feb')]")).click();
driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
driver.findElement(By.xpath("//option[contains(text(),'1900')]")).click();
driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'2')]")).click();

driver.findElement(By.xpath("//div[@id='row']//div[@id='thruDate']")).click();
driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[contains(text(),'Mar')]")).click();
driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();
driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'5')]")).click();


Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Past Week')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'This Week')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//div[@id='remove-search']")).click();
Thread.sleep(3000);


driver.findElement(By.xpath("//div[@id='advanced-report-search']//button[@class='icon-color btn btn-default btn-xs dropdown-toggle'][contains(text(),'Search More by')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Time Filter')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@class='col-xs-6 col-sm-3 col-md-2']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'None')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Custom Time')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//div[@id='frHrs']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='fromTime']//option[contains(text(),'01')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='frMns']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='frMns']//option[contains(text(),'10')]")).click();


driver.findElement(By.xpath("//div[@id='row']//div[@id='frAmPm']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='fromTime']//option[contains(text(),'PM')]")).click();

//driver.findElement(By.xpath("")).click();

driver.findElement(By.xpath("//div[@id='row']//option[contains(text(),'Custom Time Range')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='row']//div[@id='frHrs']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='fromTime']//option[contains(text(),'04')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='frMns']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='fromTime']//option[contains(text(),'15')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='frAmPm']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='fromTime']//option[contains(text(),'AM')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thHrs']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thruTime']//option[contains(text(),'04')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thMns']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thruTime']//option[contains(text(),'25')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thAmPm']//select[@class='form-control']")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='thruTime']//option[contains(text(),'PM')]")).click();
driver.findElement(By.xpath("//div[@id='row']//div[@id='remove-search']")).click();


driver.findElement(By.xpath("//div[@id='advanced-report-search']//button[@class='icon-color btn btn-default btn-xs dropdown-toggle'][contains(text(),'Search More by')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Admission Type')]")).click();
driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
driver.findElement(By.xpath("//label[contains(text(),'Blank')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Emergency')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Urgent')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[contains(text(),'Elective')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'New Born')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Trauma Center')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Medico Legal Cases')]")).click();
driver.findElement(By.xpath("//div[@id='admissionType-div']//div[@id='remove-search']")).click();


driver.findElement(By.xpath("//div[@id='advanced-report-search']//button[@class='icon-color btn btn-default btn-xs dropdown-toggle'][contains(text(),'Search More by')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@id='s-statusId']//span[contains(text(),'Status')]")).click();
driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
driver.findElement(By.xpath("//label[contains(text(),'Scheduled')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[contains(text(),'Signed in')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'In Progress')]")).click();
driver.findElement(By.xpath("//label[contains(text(),'Completed')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[contains(text(),'Unreconciled')]")).click();
driver.findElement(By.xpath("//div[@id='statusId-div']//div[@id='remove-search']")).click();

//driver.findElement(By.xpath("")).click();
driver.findElement(By.xpath("//div[@id='advanced-report-search']//button[@class='icon-color btn btn-default btn-xs dropdown-toggle'][contains(text(),'Search More by')]")).click();

driver.findElement(By.xpath("//li[@class='hidden-patient']//a[@id='s-diagnosis']//span[contains(text(),'Problems')]")).click();
driver.findElement(By.xpath("//div[@id='diagnosis']//div[@id='data-input']//div//div//input[@id='ac-input']")).click();
driver.findElement(By.xpath("//div[@id='diagnosis']//div[@id='remove-search']")).click();



driver.findElement(By.xpath("//div[@id='advanced-report-search']//button[@class='icon-color btn btn-default btn-xs dropdown-toggle'][contains(text(),'Search More by')]")).click();

driver.findElement(By.xpath("//li[@class='hidden-patient']//span[contains(text(),'Symptoms')]")).click();
driver.findElement(By.xpath("//div[@id='symptom']//div[@id='data-input']//div//div//input[@id='ac-input']")).click();
driver.findElement(By.xpath("//div[@id='symptom']//div[@id='remove-search']")).click();




}

}
