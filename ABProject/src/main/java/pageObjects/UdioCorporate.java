package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testDataTypes.Customer;


public class UdioCorporate {
	WebDriver driver;
	public UdioCorporate(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using = ".//*[@id='mobile_number']")
	private WebElement uc_mob;
	@FindBy(how=How.ID, using = "signup_btn")
	private WebElement uc_cont1;
	@FindBy(how=How.XPATH, using = ".//*[@id='password']")
	private WebElement uc_pass;
	@FindBy(how=How.XPATH, using = "//*[@id='password_screen']/form/div/div[7]/input[3]")
	private WebElement uc_cont2;
	@FindBy(how=How.XPATH, using = "//*[@id='myModal-kyc']/div[1]/p[1]/span/a")
	private WebElement skip_modal;
	@FindBy(how=How.XPATH, using = "//*[@id='top']/main/aside/ul/li[5]/a")
	private WebElement claims;
	
	public void enterDetail(Customer cus){
		
		enterNumber(cus.MobileNumber);
		clickContinue1();
		enterPassword(cus.Password);
	}
	
	
	public void enterNumber(String Mob){
		uc_mob.sendKeys(Mob);
	}
	
	public void clickContinue1(){
		
		//WebDriverWait wdw = new WebDriverWait(driver, 20);
		//wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(p.data("Login_Cont_btn"))));
		
		uc_cont1.click();
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		 
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
		//js.executeScript("window.scrollTo(0,"element.getLocation().x+")");
		
		//js.executeScript("window.scrollTo(0, element.getLocation().x+)");
		//Actions a = new Actions(driver);
		//a.moveToElement(ele).click().perform();

	}
	
	public void enterPassword(String Pwd){
		//driver.findElement(By.xpath(p.data("Pwd"))).clear();
		uc_pass.sendKeys(Pwd);
		//driver.findElement(By.xpath(p.data("Pwd")));
	}
	public void clickContinue2(){
		//driver.findElement(By.xpath(p.data("Pwd"))).submit();
		uc_cont2.submit();
	}
	
	public void skipKYCModal(){
		WebDriverWait wdw = new WebDriverWait(driver, 20);
		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myModal-kyc']/div[1]/p[1]/span/a"))).click();
	}
	
	public void verifyTit(){
		
		//String t = driver.getTitle();
		//Assert.assertEquals("UDIO - Welcome", t);
	}
	
	public void clickClaim(){
		
		claims.click();
	}
	
	/*public void getAllLinks(){
		java.util.List<WebElement> wea = driver.findElements(By.tagName("a"));
		
		String[] linkname = new String[wea.size()];
		
		
		int i =0;
		for(WebElement e : wea){
			
			linkname[i] = e.getText();
			System.out.println("\""+linkname[i]+"\"");
			i++;
		}
	}*/
	
	/*public void actionFunc(){
		
		Actions a = new Actions(driver);
		Action c = a.dragAndDropBy(driver.findElement(By.xpath("ll")), 10, 20).build();
	
	}*/
}
