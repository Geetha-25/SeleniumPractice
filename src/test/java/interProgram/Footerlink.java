package interProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Footerlink {
	public WebDriver driver;
	String ip = "https://192.168.1.5:8443/";

	@Test()
	public void browserSetup() {
		DesiredCapabilities b = DesiredCapabilities.chrome();
		b.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions n = new ChromeOptions();
		n.merge(b);
		driver = new ChromeDriver(n);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver.exe");
		driver.get(ip);
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int linkcount = li.size();
		System.out.println("total no of link is" + linkcount);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100000)", "");
		WebElement Element = driver.findElement(By.cssSelector(".unselectable.hidden-xs.hidden-sm"));
		List<WebElement> li1 = Element.findElements(By.tagName("a"));
		int linkcount1 = li1.size();
		System.out.println("total no of footer link is" + linkcount1);
		// This will scroll the page till the element is found
		// js.executeScript("arguments[0].scrollIntoView();", Element);
		/*
		 * Actions a= new Actions(driver);
		 * a.moveToElement(Element).build().perform();
		 */

	}

}
