package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Frame_Demo extends BaseClass {

	// Go to the URL --> https://jqueryui.com/tooltip/
	
	
	public static void main(String[] args) throws InterruptedException {

		setUp();

		/* Switch to frame by INDEX */
		driver.switchTo().frame(0);

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("12");

		driver.switchTo().defaultContent();

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Switch to frame by WebElement */
		WebElement frammeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frammeElement);

		age.clear();
		Thread.sleep(2000);

		age.sendKeys("25");
		Thread.sleep(2000);

		
		driver.switchTo().defaultContent();
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Switch to frame by name or ID */
		
		//driver.switchTo().frame("FrameName");
		//this frame has no name or id attributes
		
		
		tearDown();

	}

}
// Note1: You should switch to frame if the element you want to use inside a frame 
// Note2: Switch back to the main content --> driver.switchTo().defaultContent();