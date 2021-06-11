package interProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class amz {
	public static WebDriver driver;

	@Test
	public void tt() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.xpath("//span[text()='Under ₹1,000']")).click();
		driver.findElement(By.cssSelector("#a-autoid-0-announce.a-button-text.a-declarative")).click();
		List<WebElement> li = driver.findElements(By.cssSelector(".a-nostyle.a-list-link li a"));
		try{
		li.stream().filter(s -> s.getText().contains("Price: Low to High")).forEach(s -> s.click());
		}
		catch(Exception e) {
			
		};
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small'][1]"));
		
		for(int i=0;i<ele.size();i++)
		{
			if(ele.get(i).getText().contains("Generic Silicon"))
			{
				//System.out.println(ele.get(i).getText());
 System.out.println(ele.get(i).getText());
 List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small'][1]/following-sibling::div[2]/div[1]/a/span[1]"));
   System.out.println(ele1.get(i).getText());
			}
		}
		
		
}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}