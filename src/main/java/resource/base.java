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

public class base {

	public  WebDriver driver;
	public Properties prop;

	// WebDriver

	public WebDriver IntializeDriver() throws IOException {
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
		return driver;

		//return driver;
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		//String destinationFile ="C:\\Users\\kkr26\\Documents\\MavenDemoTest2\\src\\main\\java\\resource"+testCaseName+ ".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		

	}
}
