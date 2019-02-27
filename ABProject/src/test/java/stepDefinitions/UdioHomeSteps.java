package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.UdioHome;

public class UdioHomeSteps {
	TestContext tc;
	UdioHome u;
	
	public UdioHomeSteps(TestContext cont){
		tc = cont;
		u = tc.getPageObjectManager().getUdioHome();
	}
	
	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		u.clickLoginButton();
	    //throw new PendingException();
	}

}
