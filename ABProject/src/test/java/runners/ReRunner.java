package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@rerun/rerun.txt",
		glue = {"stepDefinitions"},
		monochrome = true,
		plugin = {"pretty", 
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/DesignedReports/rerunreport.html", "json:target/cucumber-reports/CucumberReRun.json" ,
				"html:target/cucumber-reports"
		}
		
		)



public class ReRunner {

	
	
	
}
