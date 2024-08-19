package com.neotech.utils;

public class Constants1 {

	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/configs/conf.properties";

	public static final int IMPLICIT_WAIT_TIME = 10;
	public static final int EXPLICIT_WAIT_TIME = 30;

}

// Note1: Since we need to see it from another package --> public

// Note2: Since we need to use the file from another package or class  --> static

// Note3: Since we do not want anyone to change the value of Configs from another package or class --> use final keyword 

// Note4: We are getting data from configs (configuration file) --> CONFIGURATION_FILEPATH

// Note5: When we have final variable, uppercase is preferable