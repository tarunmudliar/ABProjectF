package managers;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import pageObjects.OpenUdio;
import pageObjects.Rediff;
import pageObjects.UdioAccountType;
import pageObjects.UdioClaims;
import pageObjects.UdioCorporate;
import pageObjects.UdioDashBoard;
import pageObjects.UdioHome;

public class PageObjectManager {
	private WebDriver driver;
	private OpenUdio ou;
	private UdioAccountType uat;
	private UdioCorporate uc;
	private UdioHome u;
	private UdioClaims ucr;
	private Rediff rf;
	private TestContext cont;
	private UdioDashBoard udb;
	public PageObjectManager(WebDriver driver){
		
		this.driver = driver;
	}
	
	public OpenUdio getOpenUdio(){
		
		return (ou == null)?ou = new OpenUdio(driver): ou;
	}
	public UdioAccountType getUdioAccountType(){
		
		return (uat==null)?uat= new UdioAccountType(driver):uat;
	}
	public UdioCorporate getUdioCorporate(){
		
		return (uc==null)?uc=new UdioCorporate(driver):uc;
	}
	public UdioHome getUdioHome(){
		
		return (u==null)?u = new UdioHome(driver):u;
	}
	public UdioClaims getUdioClaims(){
		
		return (ucr==null)?ucr = new UdioClaims(driver):ucr;
	} 
	public Rediff getRediff(){
		return (rf ==null)?rf = (new Rediff(driver)):rf;
		
	}
	public UdioDashBoard getUdioDashBoard(){
		
		return (udb==null)?udb = new UdioDashBoard(driver): udb;
	}
}
