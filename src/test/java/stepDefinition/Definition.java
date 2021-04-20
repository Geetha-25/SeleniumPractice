package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import com.PatientRateus.RateUs;
import com.pof.Login_pof;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.base;


public class Definition extends base {
	public WebDriver driver;
	public Login_pof login_tc;
	

	@Given("^user navigates to the website 75health$")
	public void user_navigates_to_the_website_75healthcom() throws Throwable {
		driver=IntializeDriver();

	}

	@When("^user click on signin$")
	public void user_click_on_signin() throws Throwable {
		Thread.sleep(3000);

		// Login_pof login_tc= PageFactory.initElements(driver,Login_pof.class);
			login_tc = new Login_pof(driver);
		login_tc.SignIn();

	}

	@And("^user login to application using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_login_to_application_using_username_as_something_and_password_as_something(String strArg1,
			String strArg2) throws Throwable {
		// Login_pof login_tc= PageFactory.initElements(driver,Login_pof.class);
		 login_tc = new Login_pof(driver);
		login_tc.username().sendKeys(strArg1);
		login_tc.password().sendKeys(strArg2);
		
	}

	@Then("^homepage is populated$")
	public void homepage_is_populated() throws Throwable {
		// Login_pof login_tc= PageFactory.initElements(driver,Login_pof.class);
	 login_tc = new Login_pof(driver);
		login_tc.submit();
	}

	@After()
	public void teardown() {
		driver.quit();
	}

}
