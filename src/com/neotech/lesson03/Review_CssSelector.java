package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_CssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

		searchBox.sendKeys("Keyboards for Gamers");

		WebElement searchButton = driver.findElement(By.cssSelector("input#nav-search-submit-button"));

		searchButton.click();

		driver.quit();

	}

}

/* The formulas of CSS selector */

// S1: # 					-> syntax -> tag#id 
// S2: .class 				-> syntax -> tag.nav-input
// S3: [attribute='value']  -> syntax -> tag[attribute='value']

/* Wildcard chars to match certain specific situations */

// W1: ^ --> starts with --> tag[attribute$='value']
// W2: $ --> ends with --> tag[attribute^='value']
// W3: * --> contains --> tag[attribute*='value']

/*
 * Note1: If you get the element from <span> and jump to the child element; ->
 * #class > input --> #nav-search-submit-text > input
 */
