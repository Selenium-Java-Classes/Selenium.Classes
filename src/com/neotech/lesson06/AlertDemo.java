package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

//https://neotech.vercel.app/alerts
	
public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("btnAlert")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The text of the alert is -> " + alert.getText());
		
		Thread.sleep(1000);
		
		alert.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnPrompt")).click();

		Alert prompt = driver.switchTo().alert();
		
		prompt.sendKeys("Sinem");
		
		prompt.accept();
		
		tearDown();
		
	}
}


// Note1: When alert is open, you cannot interact with the main page

// Note2: After accept/dismiss the alert, we can interact with the main page

// Note3: There are four methods that we can use to accept/dismiss the alert
// -> The first one --> getText(); <-- Gets the text from the Alert
// -> The second one --> sendKeys(); <--  Sends text to the Alert
// -> The third one --> accept(); <-- Clicking on OK
// -> The fourth one --> dismiss(); <-- Clicking on Cancel