package interProgram;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class panda {
	public WebDriver driver;

	@Test
	public void teddy() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector(".nav-search-field #twotabsearchtextbox")).sendKeys("panda");
		Thread.sleep(3000);
	//System.out.println(	driver.findElement(By.cssSelector("[id*='issDiv']")).getText());
	List<WebElement> searchBar=	driver.findElements(By.cssSelector("[id*='issDiv']"));
	for(int i=0;i<searchBar.size();i++)
	{

	try{
	if(searchBar.get(i).getText().contains("panda teddy bears"))
	{
		System.out.println("inside");
		searchBar.get(i).click();
	}
	}
	catch(Exception e)
	{
		
	}
	}
	Thread.sleep(5000);
	
	List<WebElement> searchBar1=	driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal"));
	for(int i=0;i<searchBar1.size();i++)
	{
		if(searchBar1.get(i).getText().contains("Frantic Teddy Bear with Neck Bow Soft Plush Fabric (Black Panda, 5 Feet)"))
		searchBar1.get(i).click();
		Thread.sleep(3000);
	/*	Set<String> s=driver.getWindowHandles();
		Iterator<String> s1=s.iterator();
	String parent=	s1.next();
	String child=	s1.next();
	driver.switchTo().window(child);
	Thread.sleep(3000);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		*/
		
	
	}
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
