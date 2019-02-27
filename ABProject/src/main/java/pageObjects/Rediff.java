package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import selenium.Wait;

public class Rediff {
	WebDriver driver;
	String s;
	public Rediff(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	//Only takes constant expression
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Biocon')]")
	private WebElement com;
	@FindBy(how = How.XPATH, using = "//table[@class = 'dataTable']/tbody//following::td[2]/a[contains(text(), 'United')]")
	private WebElement com1;
	@FindBy(how = How.XPATH, using = "//table[@class = 'dataTable']/tbody//following::tr[2]/td[3]")
	private WebElement price;
	
	public void getRed(){
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	}
	
	public void clickCompany(){
		Wait.untilPageLoadComplete(driver, 10);
		//com1.click();
		System.out.println(price.getText());

	}
	
	
}
