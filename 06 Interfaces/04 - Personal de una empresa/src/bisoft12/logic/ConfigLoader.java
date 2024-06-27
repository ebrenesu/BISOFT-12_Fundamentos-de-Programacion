package bisoft12.logic;

import java.io.*;
import java.util.Properties;

public class ConfigLoader {
	private Properties _Prop;
	public ConfigLoader() {
		try {
	        String configFilePath = "src/bisoft12/logic/config.properties";
	        FileInputStream propsInput = new FileInputStream(configFilePath);
	        _Prop = new Properties();
	        _Prop.load(propsInput);
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e2) {
	        e2.printStackTrace();
	    }
	}
	
	public String getValue(String pName) {
		String mProperty=(_Prop.getProperty(pName));
		
		return mProperty;
	}
}
