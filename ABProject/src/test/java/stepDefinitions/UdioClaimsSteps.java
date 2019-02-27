package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.UdioClaims;

public class UdioClaimsSteps {
	TestContext tc;
	UdioClaims ucr;
	
	public UdioClaimsSteps(TestContext tc){
		this.tc = tc;
		ucr = tc.getPageObjectManager().getUdioClaims();
		
	}
	@Given("^user clicks on New Claim$")
	public void user_clicks_on_New_Claim() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.clickNewClaim();
	}

	@Given("^user enters Claim name \"([^\"]*)\"$")
	public void user_enters_Claim_name(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterClaimName(name);
	}

	@Given("^user clicks Cash and Other cards$")
	public void user_clicks_Cash_and_Other_cards() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.clickCashOther();
		
	}

	@Given("^user enters expense name \"([^\"]*)\"$")
	public void user_enters_expense_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterExpName(arg1);
	}

	@Given("^user selects date \"([^\"]*)\"$")
	public void user_selects_date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterExpDate(arg1);
	}

	@Given("^user enters Amount \"([^\"]*)\"$")
	public void user_enters_Amount(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterAmount(arg1);
	}

	@Given("^user selects Expense Type \"([^\"]*)\"$")
	public void user_selects_Expense_Type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterExpType(arg1);
	}

	@Given("^user selects Mode as \"([^\"]*)\"$")
	public void user_selects_Mode_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.enterExpMode(arg1);
	}

	@Given("^user attaches receipt$")
	public void user_attaches_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.uploadReceipt();
	}

	@When("^user clicks Save Expense$")
	public void user_clicks_Save_Expense() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.clickSaveExpense();
	}

	@Then("^user sees \"([^\"]*)\"$")
	public void user_sees(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		ucr.verifySaved(arg1);
	}


	
	
	
}
