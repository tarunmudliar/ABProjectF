package managers;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

//Can be def as static for use without instantiation in TC

public class LoggerManager {
	public Logger Log = Logger.getLogger(LoggerManager.class.getName());
	
	public LoggerManager(){
	DOMConfigurator.configure("configs/log4j.xml");
	}
	public void info(String msg){
		
		Log.info(msg);
	}
	

	 public  void warn(String message) {
	 
	    Log.warn(message);
	 
		}
	 
	 public  void error(String message) {
	 
	    Log.error(message);
	 
		}
	 
	 public  void fatal(String message) {
	 
	    Log.fatal(message);
	 
		}
	 
	 public  void debug(String message) {
	 
	    Log.debug(message);
	 
		}

}
