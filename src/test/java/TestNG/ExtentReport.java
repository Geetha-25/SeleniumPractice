package TestNG;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resource.base;

public class ExtentReport extends base{
	ExtentReports extent;
@BeforeTest
public void config()
{
	String path =System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	 extent =new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Anjali");
	
	
}
@Test
public void initialExtentReport() throws IOException{
	extent.createTest("initialExtentReport");
	driver=IntializeDriver();
	extent.flush();
	
}
}
