package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\cucumber\\src\\test\\java\\features\\login.feature"},
		glue = {"stepDefination"},
		monochrome = false,
		dryRun = false,
		plugin = {"pretty","html:reports\\fb_login.html"}
		)

public class Ts1 extends AbstractTestNGCucumberTests {
	

}
