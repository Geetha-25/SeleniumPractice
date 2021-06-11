package interProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class myntra {
	public static WebDriver driver;

	@Test
	public void tt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
WebElement kk=	driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[5]"));
		Actions a=new Actions(driver);
		a.moveToElement(kk).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Kurtas & Kurta Sets at Flat 60% Off')]")).click();
		
		
}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}