package com.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import resource.base;

public class Login_pof  {
	//public WebDriver driver;
	public Login_pof(WebDriver driver)
	{
	//	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Sign In')]")
	public WebElement signIn;
	
	@FindBy(how=How.ID, using = "userLoginId")
	public WebElement username;
	
	@FindBy(how=How.XPATH, using = "//input[@id='currentPassword']")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using = "//div[@class='col-xs-10 center-cont']")
	public WebElement submit;
	
	public void SignIn() {
		 signIn.click();;
	}
	
	public WebElement username() {
		username.clear();
		return username;
	}
	
	public  WebElement password() {
		password.clear();
		 return password;
	}
	
	public void submit() {
		submit.click();
	
		
	
	}
	
}
