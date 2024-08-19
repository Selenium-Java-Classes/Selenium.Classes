package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {
	
	public static void main(String[] args) {
		
//		Verify element is present
//	    Open chrome browser
//	    Go to "https://the-internet.herokuapp.com/"
//	    Click on the "Dynamic Loading" link
//	    Click on "Example 1..." and click on "Start"
//	    Verify element with text "Hello World!" is displayed
//	    Close the browser 
		
		
		setUp();
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.partialLinkText("Example 1")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		/* This element takes a little to load, only for this element --> use explicity wait */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		
		
		WebElement textBox = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println(textBox.getText());
		System.out.println(textBox.isDisplayed());
		
		tearDown();
			
		
	}

}
