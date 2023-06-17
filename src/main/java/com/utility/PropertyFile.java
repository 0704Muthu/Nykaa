package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	FileInputStream fis;

	public Properties propertyFIle() {
		File fil = new File("C:\\Users\\rmuth\\eclipse-workspace\\Nykaa\\src\\main\\java\\data.properties");
		try {
			fis = new FileInputStream(fil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	


}
