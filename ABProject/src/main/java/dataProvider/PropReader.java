package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class PropReader {

	private Properties prop;
	public PropReader(String s) {
	
		try {
			prop = new Properties();
			//FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\configs\\" + s);
			// "\" will give compile error
			FileInputStream fis = new FileInputStream("configs/"+s);
			try{
			prop.load(fis);
			fis.close();
			} catch(IOException e){
				
				e.printStackTrace();
			}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException("Config file not found");
	}
	}
	
	public String data(String key){
		
	return prop.getProperty(key);
	}
	
	public DriverType getBrowser(){
		String browsername = prop.getProperty("browser");
		if(browsername==null || browsername.equals("chrome")) return DriverType.CHROME;
		else if (browsername.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if (browsername.equalsIgnoreCase("ie")) return DriverType.INTERNETEXPLORER;
		else if (browsername.equalsIgnoreCase("edge")) return DriverType.EDGEDRIVER;
		else throw new RuntimeException("Browser name could not be found");
		
	}
	
	public EnvironmentType getEnvironment(){
		String envname = prop.getProperty("environment");
		if(envname==null || envname.equals("local")) return EnvironmentType.LOCAL;
		else if (envname.equalsIgnoreCase("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment name could not be found");
		
	}
	
	
	
	
}
