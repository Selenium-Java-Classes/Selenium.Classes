package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configs_Reader {
	
	private static Properties prop;

	/**
	 * This method will read the properties file
	 * 
	 * @param filePath
	 */

	public static void readProperties(String filePath) {

		try {

			FileInputStream fileIS = new FileInputStream(filePath); // -> Step1

			prop = new Properties(); // -> Step2
			prop.load(fileIS); // -> Step2.1

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("I couldn't read the file!!!");
		}

	}

	/**
	 * This method will return the value for a specified key
	 * 
	 * @param Strin key return String value
	 * @return
	 */
	public static String getProperty(String key) {

		return prop.getProperty(key);

	}
}
// Note1: First read the file -> then get the value as return
// Note2: While reading file, put the file name you want to read in the method as a parameter
// Note3: While you are reading, you do not get any return --> void

// Note4: We should get properties values --> create object -> 	Properties prop = new Properties();
// Note5: We need to access Properties object so --> put it inside of the general class  --> private static Properties prop;
// Note6: Since we put it in the general class --> no need to write the whole object -->  prop = new Properties();

// Note7: Since the creating object is not enough to get values --> .load();

// Note8: We want to return specific value properties --> .getProperty()
// Note9: You need parameter in the method -> use the paramater in the method
