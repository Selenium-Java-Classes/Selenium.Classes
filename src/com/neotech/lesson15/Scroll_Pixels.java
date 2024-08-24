package com.neotech.lesson15;

import org.openqa.selenium.JavascriptExecutor;

import com.neotech.utils.CommonMethods;

public class Scroll_Pixels extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Step1 */
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		/* Step2 */
		jse.executeScript("window.scrollBy(0,1500)");

		wait(3);

		tearDown();
	}

}

// Note1: It is used in automated tests to navigate to different parts of a webpage when elements are out of view.

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Note2: We have 2 steps to use JavaScriptExecuter Class
// 1: Create "JSExecuter" object and casting the driver -> JavascriptExecutor <name> = (JavascriptExecutor) driver;
// 2: Scroll down (vertical) the page with the with the pixels you want -> .executeScript("window.scrollBy(<pixels>)");

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Breakdown of the ("window.scrollBy(0,1500)")
// 1. window.scrollBy(x, y) -> This is a JavaScript method that scrolls the window by a CERTAIN NUMBER of PIXELS relative to the current position.
// 2. x -> horizontal(left,right) pixel value | y -> vertical(up, down) pixel value --> to which you want to scroll.

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Note3: If the value are positive (e.g., 1500), it would scroll down.
// Note4: If the value are negative (e.g., -1500), it would scroll up.
