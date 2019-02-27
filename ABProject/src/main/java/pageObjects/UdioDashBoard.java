package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class UdioDashBoard {
	
	WebDriver driver;
	public UdioDashBoard(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='cssmenu']/ul/li[3]/a/div/div")
	private WebElement vchr;
	
	
	public void moveVoucher() throws AWTException{
		//Actions a = new Actions(driver);
		//a.moveToElement(vchr).contextClick().build();
		//Point p = vchr.getLocation();
		//Robot r = new Robot();
		//r.mouseMove(p.getX(), p.getY());
		
		//a.moveByOffset(p.getX(), p.getY());
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(500,0);");
		//js.executeScript("arguments[0].scrollIntoView();", vchr);	
		//js.executeScript("document.querySelector('#cssmenu > ul > li:nth-child(6) > a > div > div').scrollIntoView();");
		Wait.untilPageLoadComplete(driver, 10);
		scrollToElementByOffset(vchr, 500);
	}
	
	private WebElement scrollToElementByOffset(WebElement element, int offset) {
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollTo(" + element.getLocation().getX() + offset + "," + (element.getLocation().getY()
	            ) + ");");

	    return element;
	}
	
}
