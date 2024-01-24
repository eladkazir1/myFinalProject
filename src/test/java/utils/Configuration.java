package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	public static String readProperty(String key) {
		String value = "";
		//read value from properties file
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;

		try {
			// Load the properties file
			fileInputStream = new FileInputStream("./src/test/resources/data/config.properties");
			properties.load(fileInputStream);

			// Read values from the properties file
			value = properties.getProperty(key);
		} catch (IOException e) {
		} 
		return value;
	}
}
