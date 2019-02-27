package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.UdioAccountType;

public class UdioAccountTypeSteps {
	TestContext tc;
	UdioAccountType uat;
	
	public UdioAccountTypeSteps(TestContext cont){
		tc = cont;
		uat = tc.getPageObjectManager().getUdioAccountType();
		
	}
	
	
	@Given("^I click Consumer Radio button$")
	public void i_click_Consumer_Radio_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		uat.selectConsumer();
		// throw new PendingException();
	}

	@When("^I click Continue button$")
	public void i_click_Continue_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    uat.clickContinue();
		//throw new PendingException();
	}

}
