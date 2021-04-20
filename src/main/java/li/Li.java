package li;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Li {

	
	public WebDriver driver;
	public Li(WebDriver driver)
	{
		this.driver=driver;
	}
	By sign= By.xpath("//a[contains(text(),'Sign In123')]");
	
	public WebElement s()
	{
		 return driver.findElement(sign);
	}
}
