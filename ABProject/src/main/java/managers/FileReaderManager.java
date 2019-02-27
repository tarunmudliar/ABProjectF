package managers;

import dataProvider.JsonDataReader;
import dataProvider.PropReader;

public class FileReaderManager {
	private static FileReaderManager frm = new FileReaderManager();
	private static PropReader pr;
	private static JsonDataReader jdr;
	
	private FileReaderManager(){
		
	}
	
	public static FileReaderManager getInstance(){
		return frm;
		
	}
	
	public PropReader getPropReader(){
		
		return (pr==null)?pr = new PropReader("ObjRepo.properties"):pr;
	}
	
	public JsonDataReader getJsonDataReader(){
		
		return (jdr==null)?jdr = new JsonDataReader():jdr;
	}
}
