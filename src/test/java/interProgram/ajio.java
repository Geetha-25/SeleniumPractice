package interProgram;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ajio {
	public  WebDriver driver;
	@Test
	public void tt() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://www.ajio.com/");
    driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("shirts"+ Keys.ENTER);
 List<WebElement> a= driver.findElements(By.cssSelector("div.brand"));
List<String> names= a.stream().filter(s->s.getText().contains("GESPO")).map(s->s.getText()).collect(Collectors.toList());
   names.forEach(h->System.out.println(h));
   
   
   List<String> names1= a.stream().filter(s->s.getText().contains("GESPO")).map(s->ss(s)).collect(Collectors.toList());
   names1.forEach(h->System.out.println(h));
   
  
 
	}
	
	private String ss(WebElement m) {
		// TODO Auto-generated method stub
		 String bran=m.findElement(By.xpath("following-sibling::div")).getText();
		return bran;
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
