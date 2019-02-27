package selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void untilJqueryIsDone(WebDriver driver, long timeout){
		until(driver, (d)-> {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//Boolean isJqueryCallDone = (Boolean)js.executeScript("return jQuery.active == 0");
			String isJqueryCallDone = (String)js.executeScript("return jQuery.active == 0");
			//if(!isJqueryCallDone) System.out.println("In Progress");
			//return isJqueryCallDone;
			//uninitialized, loading, loaded, interactive, complete
			if(isJqueryCallDone == "complete"){
				
				return true;
			}
			return false;
		},timeout);
		
	}
	
	public static void untilPageLoadComplete(WebDriver driver, long timeout){
		until(driver, (d)->{
			Boolean isPageLoaded = (Boolean)((JavascriptExecutor)driver).executeScript("return document.readyState");
			if(!isPageLoaded) System.out.println("In Progress");
			return isPageLoaded;
		}, timeout);
		
	}
	
	
	public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, long timeout){
		
		WebDriverWait wdw = new WebDriverWait(driver, timeout);
		wdw.withTimeout(timeout, TimeUnit.SECONDS);
		try{
			wdw.until(waitCondition);
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
