package interProgram;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Footerlink2 {
	public WebDriver driver;
	String ip = "https://www.amazon.in/";

	// String ip1 = "https://www.75health.com/";
	@Test()
	public void browserSetup() {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver.exe");
		driver.get(ip);
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int linkcount = li.size();
		System.out.println("total no of link is" + linkcount);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100000)", "");
		WebElement ele = driver.findElement(By.cssSelector(".navFooterVerticalColumn.navAccessibility"));
		List<WebElement> li1 = ele.findElements(By.tagName("a"));
		int linkcount1 = li1.size();
		System.out.println("total no of link is" + linkcount1);
		String linktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		li1.stream().forEach(s->s.sendKeys(linktab));
		Set<String> hh=driver.getWindowHandles();
	Iterator<String> it=	hh.iterator();
	while(it.hasNext())
	{
		it.next();
		String ll=driver.getTitle();
		System.out.println(ll);
	}
/*for(int i=0;i<linkcount1;i++)
{
	li1.get(i).sendKeys(linktab);
}*/

		// driver.close();
	}

	/*private WebElement gk(WebElement g) {
		// TODO Auto-generated method stub
		String linktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		g.sendKeys(linktab);
		return g;*/
	


}
