package resource;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public WebDriver driver;
	public Properties prop;

public static void main(String[] args) throws IOException
{
	Screenshot ss= new Screenshot();
	ss.ss1();
	ss.vv("hi");
}
public void ss1() throws IOException
{
	prop = new Properties();
	FileInputStream fis = new FileInputStream(
			"C:\\Users\\kkr26\\Documents\\MavenDemoTest2\\src\\main\\java\\com\\util\\config.properties");
	prop.load(fis);

	String browserName = prop.getProperty("browser");
	String url = prop.getProperty("url");

	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkr26\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();

	} else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kkr26\\Documents\\geckodriver.exe");
		driver = new ChromeDriver();

	}
	driver.get(url);
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
public void vv(String filename) throws IOException
{
	 TakesScreenshot scrShot =((TakesScreenshot)driver);

     //Call getScreenshotAs method to create image file

             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

             File DestFile=new File("C:\\Users\\kkr26\\Documents\\MavenDemoTest2\\src\\main\\java\\resource"+ filename+ ".png");

             //Copy file at destination

             FileUtils.copyFile(SrcFile, DestFile);
}
	
}
