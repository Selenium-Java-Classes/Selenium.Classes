package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWait extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		driver.findElement(By.id("downloadButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
		
		WebElement label = driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println("The label text is --> " + label.getText());
		
		
		tearDown();

	}

}
// Note1: There are two ExplicitWait --> WebDriverWait | FluentWait
// Note2: You have to initialize the WebDriverWait for you to use.
