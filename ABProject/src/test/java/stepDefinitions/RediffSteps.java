package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.Rediff;

public class RediffSteps {
	TestContext tc;
	Rediff rf;
	
	public RediffSteps(TestContext test){
		this.tc = test;
		rf = tc.getPageObjectManager().getRediff();
		
	}
	@Given("^user opens Rediff website$")
	public void user_opens_Rediff_website() throws Throwable {
		rf.getRed();
		
	}

	@Given("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		rf.clickCompany();
		
	}
	
	
}

