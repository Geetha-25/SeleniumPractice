package testRunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/featurefile"
 ,glue={"stepDefinition"},
 format={"pretty", "html:target1/cucumber-reports"},
 monochrome=true
 )
public class TestRunner extends AbstractTestNGCucumberTests  {
	
	 
	
}
