package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		for(WebElement checkBox : checkBoxList) {
			checkBox.click();
		}
		
		Thread.sleep(1000);

		tearDown();
	}

}

// Note1: Differences between finElement and findElements

// 1.a -> findElement returns the FIRST web element with that xpath if there are multiple WebElements
// 1.b -> findElements returns all the web elements with that xpath if there are multiple WebElements

// 2.a -> findElement will throw an Exception when the xPath is wrong
// 2.b -> findElements will return an Empty List of WebElements when the xPath is wrong

// 3.a -> findElement returns the web element with that xpath if there is only one WebElement
// 3.b -> findElements returns the web element inside a list if there is only one WebElement


// Note2: Since the findElements() method locate the list of the web elements use --> List<WebElement>

// Note3: For clicking on the each of the check boxes use --> for loop
