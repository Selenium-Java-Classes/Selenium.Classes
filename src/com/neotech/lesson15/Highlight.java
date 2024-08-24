package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Highlight extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

		jse.executeScript("arguments[0].style.backgroundColor='blue'", logo);

		wait(2);

		tearDown();
	}

}

// Breakdown of ("arguments[0].style.backgroundColor='blue'", music)
// 1) arguments[0]: This refers to the first argument passed to the JavaScript code, which is <WebElement>.
// 2) .style.backgroundColor='blue'-> sets the backgroundColor CSS property of the element to the color you choose, changing the element's background color.
// 3) <WebElement> -> argument being passed to the JavaScript code.
