package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

//https://hrm.neotechacademy.com/auth/login

public class ScreenShot extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Log-in */
		sendText(driver.findElement(By.id("txtUsername")), Configs_Reader.getProperty("username"));

		sendText(driver.findElement(By.id("txtPassword")), Configs_Reader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(3);

		TakesScreenshot ssDriver = (TakesScreenshot) driver; // -> Create object to take ss

		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE); // -> Captured the ss

		try {
			File screenShotsDir = new File("screenshots/HRM");

			if (!screenShotsDir.exists()) {
				screenShotsDir.mkdirs();
			}

			File screenShotLocation = new File("screenshots/HRM/dashboard1.png");
			Files.copy(screenShot, screenShotLocation);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}

		tearDown();
	}

}

// Note1: WebDriver interface does not take screenshot, so you should down-cast into RemoteDriver

// Note2: In Selenium, taking a screenshot is done using the getScreenshotAs method from the TakesScreenshot interface.

// Note3: TakesScreenshot ssDriver = (TakesScreenshot) driver

// Note4: All are the images are file objects at the same time -> File <name> = <name>.getScreenshotAs(OutputType.FILE);

// Note5: OutputType.FILE --> in Selenium specifies that the screenshot will be captured and returned as a File object
