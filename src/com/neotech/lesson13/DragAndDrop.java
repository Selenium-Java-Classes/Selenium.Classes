package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

// http://webdriveruniversity.com/Actions/index.html
	
public class DragAndDrop extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		Actions action = new Actions(driver);
		
		/* Darg and Drop */
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		//action.dragAndDrop(draggable, droppable).perform();
		
		action.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();
		
		
		wait(1);
		
		tearDown();
		
	}

}
