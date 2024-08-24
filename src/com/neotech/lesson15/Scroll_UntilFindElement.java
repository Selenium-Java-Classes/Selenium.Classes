package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

// https://www.amazon.com/
// To scroll an app to specified elements

public class Scroll_UntilFindElement extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		wait(6);

		/* Step1 */
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		/* Step2 */
		WebElement sellElement = driver.findElement(By.xpath("//li[@class='nav_first']/a[text()='Sell on Amazon']"));

		/* Step3 */
		jse.executeScript("arguments[0].scrollIntoView(true);", sellElement);

		wait(3);

		tearDown();

	}

}
// Note1: This will scroll the page until we find the element.

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Note2: We have 3 steps to use JavaScriptExecuter Class
// Step1: Create "JSExecuter" object and casting the driver -> JavascriptExecutor jse = (JavascriptExecutor) driver;
// Step2: Locate the webelement that we want to scroll the app to the element directly 
// Step3: Create a method -> js.executeScript("arguments[0].scrollIntoView(true);", element);

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Breakdown of the ("arguments[0].scrollIntoView(true);", <WebElement>)

// 1. arguments[0] -> refers to the first argument passed to the JavaScript code, which is WebElement.
// 2. scrollIntoView() -> JavaScript method that scrolls the webpage to make the element visible in the viewport.
// 3. scrollIntoView(true) -> The true parameter aligns the top of the element with the top of the viewport.
// 4.  <WebElement> -> first argument passed to the JavaScript code.