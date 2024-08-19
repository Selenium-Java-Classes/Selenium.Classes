package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

//https://jqueryui.com/droppable/

public class DragAndDrop extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		swicthToFrame(0); // -> First we need to switch the frame that our target
		
		wait(2);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		
		/* First way */
		action.dragAndDrop(draggable, droppable).perform(); //-> draggable area go to droppable area
		
		/* Second way */
		action.clickAndHold(draggable).moveToElement(droppable).release().perform();
		
		wait(2);
		
		tearDown();
	
		
		/* Second way */
		
		
	}

}


// Note1: Do NOT forget perform() -> otherwise there will be nothing


// Note2: Breakdown of -> action.clickAndHold(draggable).moveToElement(droppable).release().perform();

// action.clickAndHold() -> This command clicks on a web element and holds the mouse button down.
// moveToElement() 		 -> After holding the draggable element, this command moves the cursor to another web element.
// release()			 -> This command releases the mouse button over the droppable element, effectively dropping the draggable element onto it.
// perform() 			 -> This final command executes the entire sequence of actions.


// Note3: Breakdown of -> action.dragAndDrop(draggable, droppable).perform();

// action.dragAndDrop() -> It combines the actions of clicking on a source element (draggable) moving it to a target element (droppable), and then releasing it, all in one method.
// perform() 			-> This final command executes the entire sequence of actions.