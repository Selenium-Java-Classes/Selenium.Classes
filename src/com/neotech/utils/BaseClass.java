package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static WebDriver driver;

	/**
	 * This method will initialize the browser
	 */

	public static void setUp() {

		Configs_Reader.readProperties(Constants1.CONFIGURATION_FILEPATH);

		switch (Configs_Reader.getProperty("browser")) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			throw new RuntimeException("Other browsers are not supported");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants1.IMPLICIT_WAIT_TIME));
		driver.get(Configs_Reader.getProperty("url"));
	}

	/**
	 * This method will quit the browser
	 */
	public static void tearDown() {

		if (driver != null)
			driver.quit();
	}
}

// Note1: We need Baseclass to open and close the browser

// Note2: For us to open a browser, give some options --> no need to change the browser all the time

// Note3: First get the path from reader --> <ReaderFile>.getProperty(<ConstantsFile>.CONFIGURATION_FILEPATH);

// Note4: Create switch-case --> with the reader --> switch (<ReaderFile>.getProperty("browser"))

// Note5: Declare a static WebDriver instance variable, which will be used to control the browser.

// Note5: And then manage the window and go to the url in the reader file

// Note6: If we have only one statement no need to curly brackets --> 	if (driver != null)  driver.quit();
