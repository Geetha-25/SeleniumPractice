package com.PatientHomePageTestcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PatientHomepages.LoginPage;
import com.patientLogin.patientLogin;

public class HomePageTestcase3 extends patientLogin{
	@Test
	public void listEhr() throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPage patient = PageFactory.initElements(driver,LoginPage.class);
		Thread.sleep(3000);
		patient.setDateformat();
}
}