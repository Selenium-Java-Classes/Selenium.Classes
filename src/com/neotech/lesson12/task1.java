package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

public class task1 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		Actions action = new Actions(driver);

		WebElement el = driver.findElement(By.id("txtUsername"));
		
		action.moveToElement(el).doubleClick().sendKeys(Configs_Reader.getProperty("username")).perform();
	
		wait(2);
	
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		
		TakesScreenshot ssDriver = (TakesScreenshot) driver;

		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE); 

		try {
			File screenShotsDir = new File("screenshots/HRM");

			if (!screenShotsDir.exists()) {
				screenShotsDir.mkdirs();
			}

			File screenShotLocation = new File("screenshots/HRM/error1.png");
			Files.copy(screenShot, screenShotLocation);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}
		
		wait(2);
		
		tearDown();
	}

}
