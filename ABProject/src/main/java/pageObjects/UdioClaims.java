package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vimalselvam.cucumber.listener.Reporter;

public class UdioClaims {
	
	WebDriver driver;
	public UdioClaims(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='addNewClaim']")
	private WebElement new_claim;
	@FindBy(how=How.XPATH, using="//*[@id='claim_title']")
	private WebElement claim_name;
	@FindBy(how=How.XPATH, using="//*[@id='draft_expense_option']/div[4]/div[2]/a/img")
	private WebElement cash_other;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_title']")
	private WebElement expense_name;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_date']")
	private WebElement expense_date;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_amount']")
	private WebElement amount;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_type']")
	private WebElement expense_type;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_mode']")
	private WebElement mode;
	@FindBy(how=How.XPATH, using="//*[@id='add_expense_claim_form']/div[2]/div[9]/div[1]/a")
	private WebElement save_expense;
	//equivalent
	/*@FindBy(how=How.CSS, using=".bootstrap-datetimepicker-widget.table.thead.tr:first-child.th")
	private WebElement cal_title;*/
	@FindBy(css =".bootstrap-datetimepicker-widget.table.thead.tr:first-child.th")
	private WebElement cal_title;
	@FindBy(how = How.XPATH, using = "//*[@id='add_file']")
	private WebElement upRec;
	@FindBy(how  = How.XPATH, using = "//*[@id='successMsgText']/small")
	private WebElement expSaved;
	
	public void clickNewClaim(){
		
		new_claim.click();
	}
	
	public void enterClaimName(String name){
		claim_name.sendKeys(name);
		
	}
	public void clickCashOther(){
		cash_other.click();
		
	}
	public void enterExpName(String name){
		expense_name.sendKeys(name);
		
	}
	public void enterExpDate(String date){
		
		((JavascriptExecutor)driver).executeScript ("document.getElementById('add_expense_date').removeAttribute('class',0);"); 
		expense_date.clear();
		expense_date.sendKeys(date);
		//Implement correctly!
		//expense_date.click();
		//cal_title.click();
	}
	public void enterAmount(String am){
		amount.sendKeys(am);
		
	}
	public void enterExpType(String type){
		Select ss = new Select(expense_type);
		ss.selectByVisibleText(type);
		
	}
	public void enterExpMode(String m){
		Select ss = new Select(mode);
		ss.selectByVisibleText(m);
		
	}
	public void clickSaveExpense(){
		save_expense.click();
		
	}
	
	public void uploadReceipt(){
		
		upRec.sendKeys(System.getProperty("user.dir")+"\\UploadFile\\W.jpg");
	}
	
	public void verifySaved(String s) throws Exception{
		String r = expSaved.getText();
		if(r.contains(s))
			Reporter.addStepLog("Text Match, Expense Saved");
		else
			throw new Exception("Text Mismatch");
		
	}
	
	
}
