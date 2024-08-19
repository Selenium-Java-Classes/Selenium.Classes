package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

//url = https://neotech.vercel.app/waits

public class WedDriverWait_ExplicitWait extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		
		WebElement button = driver.findElement(By.id("button1"));
		
		if(button.isDisplayed()) {
			
			System.out.println("The button is displayed.");
			button.click();
		
		} else {
			System.out.println("The button is NOT displayed.");
		}
		
	

		
		tearDown();
		
	}

}

// Note1: explicitWait -> WebDriverWait | FluentWait

// Note2: explicitWait --> This will only responsible for the element inside of the condition.

// Note3: WebDriverWait syntax --> WebDriverWait wait = new WebDriverWait(<DriverName>, Duration.ofSeconds());

// Note4: WebDriverWait --> uses ExpectedConditions class

