package com.neotech.lesson15;

import org.openqa.selenium.JavascriptExecutor;

import com.neotech.utils.CommonMethods;

public class Scoll_UntilEndOfThePage extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		wait(2);

		tearDown();
	}

}

// Note1: This code scrolls to the bottom of a webpage, useful in automated tests to reach elements not visible without scrolling.

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

// Breakdown of the (window.scrollTo(0,document.body.scrollHeight)"):

// 1. window.scrollTo(x, y) -> This is a JavaScript method that scrolls the window to a particular set of coordinates.
// 2. x -> horizontal pixel value | y -> vertical pixel value --> to which you want to scroll.
// 3. document.body  -> <body> element of the HTML document.
// 4. scrollHeight   -> property that gives the total height of the content of an element, including the part that is not visible on the screen due to overflow.
// 5. document.body.scrollHeight -> gives the height(y-vertical) of the entire page.