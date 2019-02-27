package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.TestContext;

public class OpenUdio {
	//TestContext cont;
	WebDriver driver;
	public OpenUdio(WebDriver driver){
		this.driver = driver;
		//cont = tc;
		PageFactory.initElements(driver, this);
	}
	
	public void getUdio(){
		
		driver.get("https://www.udio.in/");
		//cont.getLog().Log.info("Opened Udio");
		driver.manage().window().maximize();
		//cont.getLog().Log.info("Maximized");
	}
	
}
