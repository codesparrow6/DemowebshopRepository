package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Chandru
 * 
 */
public class PropertyUtility implements IAutoConstants {
	/**
	 * This method is developed to read the data from property file.
	 * This methods accept key of which parameter you wants to fetch
	 * @param Key
	 * @return the value of the key
	 */
	public String getDataFromPropertyFile(String Key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		}catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(Key);
	}
}
