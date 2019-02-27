package pageObjects;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdioAccountType {
	WebDriver driver;
	public UdioAccountType(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//@FindBy(how = How.XPATH, using = ".//*[@id='frm-login-redirect']/div[1]/label[1]/i")
	//private WebElement uat_consumer_radio;
	@FindBy(how = How.XPATH, using = ".//*[@id='btnLogin']")
	@CacheLookup
	private WebElement uat_Continue;

	public void verifyTitle() throws InterruptedException {

		// WebElement consumer=
		// driver.findElement(By.xpath(p.data("Consumer_xpath")));
		//String title = driver.getTitle();
		//Assert.assertEquals("UDIO Corporate", title);
	}

	public void selectConsumer() {
		//1
		 WebDriverWait wdw = new WebDriverWait(driver, 20);
		
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm-login-redirect']/div[1]/label[1]/i"))).click();
		// driver.findElement(By.xpath(p.data("Consumer_xpath")));
		
		//2
		//uat_consumer_radio.click();
		
		//3
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		Function<WebDriver, WebElement> oo = d -> d.findElement(By.xpath(".//*[@id='frm-login-redirect']/div[1]/label[1]/i"));
		WebElement consumer_radio = w.until(oo);
		//consumer_radio.click();
		
		//4
		WebElement consumer_radio2 = w.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver){
				return driver.findElement(By.xpath(".//*[@id='frm-login-redirect']/div[1]/label[1]/i"));
			}
		});
		//consumer_radio2.click();
		
	}

	public void clickContinue() {

		/*
		 * Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
		 * .withTimeout(20, TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement f = w.until(new Function<WebDriver, WebElement>(){ public
		 * WebElement apply(WebDriver driver ){
		 * 
		 * return driver.findElement(By.xpath(p.data("Continue_button"))); }
		 * 
		 * }); f.click();
		 */
		uat_Continue.click();
		/*
		 * WebDriverWait wdw = new WebDriverWait(driver, 10);
		 * wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.
		 * data("Continue_button"))));
		 * driver.findElement(By.xpath(p.data("Continue_button"))).click();
		 */
	}
}
