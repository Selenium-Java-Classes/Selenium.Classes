package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

// url = https://hrm.neotechacademy.com/

public class LoginTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Send username */
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(username, Configs_Reader.getProperty("username"));

		/* Send password */
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		sendText(password, Configs_Reader.getProperty("password"));

		wait(3);

		/* Click on Log-in */

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		wait(3);

		/* Confirm if you logged in and see the logo */
		WebElement logo = driver.findElement(By.xpath("//div[@id='ohrm-small-logo']"));

		if (logo.isDisplayed()) {
			System.out.println("Test Passed.");
		} else {
			System.out.println("Test Failed.");
		}

		wait(3);

		tearDown();

	}

}

// Note1: For putting them in one line --> sendText(driver.findElement(By.xpath("//input[@id='txtUsername']")), Configs_Reader.getProperty("username"));
