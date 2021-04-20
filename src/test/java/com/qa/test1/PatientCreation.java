
package com.qa.test1;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.apache.http.MessageConstraintException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientCreation extends Login {

	@Test(priority = 2)

	public void patientCreation() throws InterruptedException, IOException {
		WebElement patientSearch = driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div[1]/div[2]/div/table/tbody/tr/td[2]/div/div[6]/div[46]/div[1]/div/div[1]/div/div/div/table/tbody/tr/td[3]/div/button"));
		patientSearch.click();
		Thread.sleep(3000);
		WebElement box = driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-9 col-md-6 white-box']"));
		WebElement firstName = driver
				.findElement(By.xpath("//div[@class='col-xs-12 col-sm-9 col-md-6 white-box']//input[@id='firstName']"));
		firstName.sendKeys("Sara");
		WebElement lastName = driver
				.findElement(By.xpath("//div[@class='col-xs-12 col-sm-9 col-md-6 white-box']//input[@id='lastName']"));
		lastName.sendKeys("Brown");	

		Select gender1 = new Select(box.findElement(By.id("gender")));
		gender1.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@id='birthDate2']")).sendKeys("1996-05-05");

		WebElement email = driver.findElement(
				By.xpath("//div[@class='col-xs-12 col-sm-9 col-md-6 white-box']//input[@id='userLoginId']"));
		email.sendKeys("thilak1006@gmail.com");

		WebElement phoneNo = driver
				.findElement(By.xpath("//div[@class='intl-tel-input allow-dropdown']//input[@id='phone']"));
		phoneNo.sendKeys("+919360189957");

		WebElement element = driver.findElement(By.xpath("//div[@class='col-xs-8']//span[contains(text(),'Cancel')]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		WebElement ff = driver.findElement(
				By.xpath("//button[@class='icon-color btn btn-default']//span[contains(text(),'Create')]"));

		actions.moveToElement(ff).click().perform();
		WebElement gg = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[6]/div[6]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		gg.click();
		Thread.sleep(2000);
		WebElement err=driver.findElement(By.xpath("//div[@id='--message--']"));
		String message=err.getText();
		
		System.out.println("Error message is "+ message);
		driver.close();

	}
	

}
