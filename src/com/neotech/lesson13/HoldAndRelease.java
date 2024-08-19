package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HoldAndRelease extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//div[@id='click-box']"));
		
		action.clickAndHold(button).pause(1000).release().pause(1000).perform();
		
		wait(2);
		
		tearDown();
		
	}

}
