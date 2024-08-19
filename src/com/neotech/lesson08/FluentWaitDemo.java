package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

//https://neotech.vercel.app/waits

public class FluentWaitDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		WebElement button = driver.findElement(By.id("button1"));
		System.out.println("The invisible button is now available: " + button.isDisplayed());
		button.click();
		
		tearDown();
		
	}
	
}

// Note1: explicitWait -> WebDriverWait | FluentWait

// Note2: Syntax --> FluentWait <WebDriver> wait = new FluentWait <WebDriver> (driverName);

// Note3: It is used to tell the driver to wait for a condition.

// Note4: .ignoring(NoSuchElementException.class) -> It will not stop the code even if there is a exception

