package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

// https://www.amazon.com/
// Click on the sell products on Amazon

public class JavaScriptExecuter_Click extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Step1 */
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		/* Step2 */
		WebElement sellElement = driver.findElement(By.xpath("//li[@class='nav_first']/a[text()='Sell on Amazon']"));

		/* Step3 */
		jse.executeScript("arguments[0].click()", sellElement);

		wait(3);

		/* Check if the page is correct after we click */

		String sellingText = driver.findElement(By.xpath("//h4[text()='How to sell with Amazon']")).getText();

		if (sellingText.equals("How to sell with Amazon")) {
			System.out.println("Test passed.");

		} else {
			System.out.println("Test failed.");
		}

		tearDown();

	}

}
// Note1: When dealing with elements that might not be easily clickable using Selenium's default .click() method.

// Note2: We have 3 steps to use JavaScriptExecuter Class
// Step1: Create "JSExecuter" object and casting the driver -> JavascriptExecutor jse = (JavascriptExecutor) driver;
// Step2: Locate the webelement that we want to click on
// Step3: Create a method -> jse.executeScript("Relevant Script", relevant webElement);