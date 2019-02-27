package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.OpenUdio;

public class OpenUdioSteps {
	TestContext tc;
	OpenUdio ou;
	public OpenUdioSteps(TestContext cont){
		tc = cont;
		ou = tc.getPageObjectManager().getOpenUdio();
	}
	
	@Given("^I have opened browser$")
	public void i_have_opened_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
	
		
	}
	
	
	@Given("^opened Udio website$")
	public void opened_Udio_website() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ou.getUdio();
		tc.getLog().Log.info("Opened Website successfully");
	   // throw new PendingException();
	}

	
}
