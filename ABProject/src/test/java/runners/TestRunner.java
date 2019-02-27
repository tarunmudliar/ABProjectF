package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/DashboardTests.feature",
		//Directly searches in src/test/java
		glue = {"stepDefinitions"},
		dryRun = false,
		//tags= {"@Functional"},
		//just to see the time taken by each step 
		//plugin = {"usage"}
		//plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"},
		plugin = {"pretty", "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/DesignedReports/report.html", "json:target/cucumber-reports/Cucumber.json",
		"rerun:rerun/rerun.txt"		
		},
		monochrome = true
		
		)
public class TestRunner {
	@AfterClass
	public static void writeExtentReport(){
		
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\configs\\" + "extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.14");
	    Reporter.setSystemInfo("Maven", "3.5.1");
	    Reporter.setSystemInfo("Java Version", "1.8.0_91");
	}
}
