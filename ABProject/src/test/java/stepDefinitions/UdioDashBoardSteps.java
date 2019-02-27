package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.UdioDashBoard;

public class UdioDashBoardSteps {
	TestContext tc;
	UdioDashBoard udb; 
	public UdioDashBoardSteps(TestContext tc){
		this.tc = tc;
		udb = tc.getPageObjectManager().getUdioDashBoard();
	}
	
	@Then("^user does a left scroll$")
	public void user_does_a_left_scroll() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		udb.moveVoucher();
	}
}
