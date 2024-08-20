package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

//https://neotech.vercel.app/waits

public class WaitExplicit extends CommonMethods {

	public static void main(String[] args) {

		setUp();


		WebElement button = driver.findElement(By.id("button1"));

		System.out.println("The invisible button is now available -> " + button.isDisplayed());

		button.click();

		wait(2);

		tearDown();

	}
}
