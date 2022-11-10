package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features"}, 
		                  
		glue  = {"stepDefination"},
		plugin = {"pretty","html:target/Cucumber_Report.html"}, 
		tags = "@SanityTest",
		dryRun = false,
		monochrome = true
		

		)
public class TestRunnerwithTestNG extends AbstractTestNGCucumberTests{


}
