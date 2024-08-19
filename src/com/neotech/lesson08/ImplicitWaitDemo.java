package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("button1")).click();
		
		tearDown();
		
		
	}
}


// Note1: implicitlyWait() -> It help us to set time for the page load 

/* Note2: implicitlyWait() -> finElement() and finElements() immediatly try to locate the element.
			If the element has not load until then, the code will throw an exception */

// Note3: implicitlyWait() -> will wait up to 15 second | thread.sleep -> has to wait until the second you entered done.

// Note4: implicitlyWait() -> right after the driver initialize
 
// Note5: implicitlyWait() -> you do not need to write this over and over again. It will be work until the driver quit.

// Note6: pageLoadTimeout() -> waits for the page to load
// Note7: Use it only when you use drivet.get() driver.navigate().to()


