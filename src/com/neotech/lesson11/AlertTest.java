package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

//https://demo.guru99.com/test/delete_customer.php

public class AlertTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();

		wait(2);

		System.out.println(getAlertText()); // -> It will swtich to the driver

		wait(2);

		dismissAlert();

		wait(2);

		/* Create the alert again by clicking on the button */
		driver.findElement(By.name("submit")).click();
		acceptAlert();

		wait(2);

		tearDown();
	}

}
