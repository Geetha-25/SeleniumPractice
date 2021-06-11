package interProgram;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonProgram {
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
		String price=driver.findElement(By.xpath(" //div[@data-asin='B08Q8KT7NV']  //div[@class='a-section a-spacing-none a-spacing-top-small'][1]/following-sibling::div[2]/div[1]/a/span[1]")).getText();
		System.out.println("hlllllllllllllllll" +price);
		List<WebElement> name = driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal"));
		List<String> hh1=name.stream().filter(m->m.getText().contains("Generic Silicon")).map(m->m.getText()).collect(Collectors.toList());
		hh1.forEach(r -> System.out.println(r));
	
		
		//List<WebElement> name1 = driver.findElements(By.cssSelector(".a-section.a-spacing-none.a-spacing-top-small"));
		List<WebElement> name1 = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small'][1]"));
		List<String> hh3=name1.stream().filter(m->m.getText().contains("Generic Silicon")).map(m->m.getText()).collect(Collectors.toList());
		hh3.forEach(r -> System.out.println(r));
		
		
		
		
	
	
		List<String> hh2=name1.stream().filter(m->m.getText().contains("Generic Silicon")).map(m->getprice(m)).collect(Collectors.toList());
		hh2.forEach(m -> System.out.println("amountyyyyy"+m));
	
	
	
	
	
	
		List<String> amount = name1.stream().filter(b -> b.getText().contains("Generic Silicon")).map(b -> getprice(b))
				.collect(Collectors.toList());
		amount.forEach(r -> System.out.println(r));

	}

	private static String getprice(WebElement b) {
		// TODO Auto-generated method stub

	
	String kk=	b.findElement(By.xpath("following-sibling::div[2]/div[1]/a/span[1]")).getText();
		return kk;
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}