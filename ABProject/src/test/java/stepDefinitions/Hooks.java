package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	TestContext tc;
	
	public Hooks(TestContext tc) {
		// TODO Auto-generated constructor stub
		this.tc = tc;
		
	}
	@Before
	
	public void beforeScenario(Scenario sc){
		Reporter.assignAuthor("Tarun");
		
		
	}
	
	@After(order=1)
	public void afterScenario(Scenario scenario){
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				//Used cast here, as getScreenshot is not in WebDriver class and WD is not TS at 
				//compile time. Its implemented in RemoteWebDriver class through 
				//TakeScreenshot Interface which is extended by ChromeDriver; 
				//So through this chain WebDriver is TakesScreenshot at Run Time
				File sourcePath = ((TakesScreenshot) tc.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/DesignedReports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   
		
				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
		
	}
	
	/*@After(order=0)
	
	public void after(){
		
		tc.getWebDriverManager().closeDriver();
	}*/
	
	
}
