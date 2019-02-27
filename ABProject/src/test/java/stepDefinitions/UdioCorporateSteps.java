package stepDefinitions;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.UdioCorporate;
import testDataTypes.Customer;

public class UdioCorporateSteps {
	TestContext tc;
	UdioCorporate uc;
	
	public UdioCorporateSteps(TestContext cont) {
		// TODO Auto-generated constructor stub
		tc = cont;
		uc = tc.getPageObjectManager().getUdioCorporate();
		
	}
	
	@Then("^user enters details of \"([^\"]*)\"$")
	public void user_enters_details_of(String num) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Customer cus = FileReaderManager.getInstance().getJsonDataReader().getCustomerByNumber(num);
		uc.enterDetail(cus);
	}
	
	
	@Then("^I am taken to Login Page$")
	public void i_am_taken_to_Login_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//uc.verifyTitle();
		//throw new PendingException();
	}
	
	

	@Given("^user enters Mobile\"([^\"]*)\"$")
	public void user_enters_Mobile(String Mob) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		uc.enterNumber(Mob);
		//throw new PendingException();
	}

	@When("^user enters Password\"([^\"]*)\"$")
	public void user_enters_Password(String Pwd) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    uc.enterPassword(Pwd);
		//throw new PendingException();
	}
	

	@Given("^user clicks Continue button$")
	public void user_clicks_Continue_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    uc.clickContinue1();
		//throw new PendingException();
	}

	

	@When("^clicks Continue$")
	public void clicks_Continue() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    uc.clickContinue2();
		Reporter.addStepLog("We are now on Home");
		//throw new PendingException();
	}

	@When("^user taps skip on Modal$")
	public void user_taps_skip_on_Modal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uc.skipKYCModal();
		//throw new PendingException();
	}
	
	@Then("^user lands on home page$")
	public void user_lands_on_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}
	
	@When("^all the links are printed$")
	public void all_the_links_are_printed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //uc.getAllLinks();
		//throw new PendingException();
	}
	
	@Given("^user waits for loader to disappear$")
	public void user_waits_for_loader_to_disappear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(10000);
		//throw new PendingException();
	}

	@Given("^user clicks on Claims&Reimbursement$")
	public void user_clicks_on_Claims_Reimbursement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uc.clickClaim();
		//throw new PendingException();
	}
	

	
	
}
