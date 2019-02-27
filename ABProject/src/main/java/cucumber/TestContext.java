package cucumber;

import java.net.MalformedURLException;

import managers.LoggerManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	private WebDriverManager wdm;
	private PageObjectManager pom;
	public ScenarioContext sct;
	private LoggerManager lg;
	
	public TestContext() throws MalformedURLException{
		wdm = new WebDriverManager();
		pom = new PageObjectManager(wdm.getDriver());
		sct = new ScenarioContext(); 
		lg = new LoggerManager();
	}
	
	public  WebDriverManager getWebDriverManager(){
		
		return wdm;
	}
	public PageObjectManager getPageObjectManager(){
		
		return pom;
	}
	
	public ScenarioContext getScenarioContext(){
		
		return sct;
	}
	
	public LoggerManager getLog(){
		
		return lg;
	}
	
}
