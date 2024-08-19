package com.neotech.lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

//https://neotech.vercel.app/iframe

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		/* First way - by Index */

		// driver.switchTo().frame(0);
		// driver.findElement(By.id("age")).sendKeys("25");

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		/* Second way - by ID or Name */

		// driver.switchTo().frame("age-frame");
		// driver.findElement(By.id("age")).sendKeys("25");

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		/* Third way - by WebElement */

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frameElement);

		WebElement ageTxt = driver.findElement(By.id("age"));

		ageTxt.sendKeys("25");
		ageTxt.clear();
		ageTxt.sendKeys("30");

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Nested iframes")).click();

		Thread.sleep(1000);

		tearDown();
	}

}

// Note1: driver.findElement(By.id("age")).sendKeys("25"); 
// Note2: This will throw an exception because the focus is inside the frame BUT the element is putside the frame


