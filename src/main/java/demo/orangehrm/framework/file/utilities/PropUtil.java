package demo.orangehrm.framework.file.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	// Reads a properties file and returns a Properties object
	
	public static Properties readData(String fileName) {
	    String fullPath = System.getProperty("user.dir") + "/Config/" + fileName;
	    Properties properties = new Properties();
	    try (FileInputStream fis = new FileInputStream(fullPath)) {
	        properties.load(fis);
	    } catch (IOException e) {
	        System.err.println("Could not read properties file: " + fullPath);
	        e.printStackTrace();
	    }
	    return properties;
	}
	// Gets a property value by key from a Properties object
	public static String getProperty(Properties properties, String key) {
		return properties.getProperty(key);
	}

	// Convenience method: get property value directly from file and key
	public static String getProperty(String fileName, String key) {
		Properties properties = readData(fileName);
		return properties.getProperty(key);
	

	}
	

}
