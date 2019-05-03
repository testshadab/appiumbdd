package testRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"F:\\ECOM_DemoTest\\MobileApp\\src\\test\\resources\\SignUp.Feature"},tags= {"@signupvalidationtesting"},
plugin ={"pretty", "html:target/cucumber-report"})

public class AppRunner {
	@BeforeClass
	public static void beforeClass() throws Exception {
		SetupClass.before_Class();
	}	
	@AfterClass
	public static void afterClass() throws Exception {
			SetupClass.after_Class();
}
	
}


