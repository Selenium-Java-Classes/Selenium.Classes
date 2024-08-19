package com.neotech.lesson06;

import com.neotech.utils.Configs_Reader;
import com.neotech.utils.Constants1;

public class Test1 {
	
	public static void main(String[] args) {
	

		Configs_Reader.readProperties(Constants1.CONFIGURATION_FILEPATH);
		
		String browser = Configs_Reader.getProperty("browser");
		System.out.println("Browser -->" + browser) ;
		
		System.out.println("url --> " + Configs_Reader.getProperty("url"));
		
	}

}


// Note1: Read the file only one time --> Configs_Reader.readProperties(Constants1.CONFIGURATION_FILEPATH);

// Note2: To accesing the browser key in the properties --> readerFile + .getProperty()

// Note3: In the .getProperty() method --> name of the key in the properties file