package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class TestCase1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement iFrameElement = driver.findElement(By.id("sampleHeading"));

		driver.switchTo().frame(iFrameElement);

		Thread.sleep(1000);
		
		if (iFrameElement.isDisplayed()) {
			System.out.println("The frame is displayed.");

		} else {
			System.out.println("The frame is NOT displayed.");
		}

		Thread.sleep(1000);

		tearDown();

	}
}
