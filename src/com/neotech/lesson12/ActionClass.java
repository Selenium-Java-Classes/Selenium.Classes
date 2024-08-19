package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

//url = https://amazon.com 

public class ActionClass extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		Actions action = new Actions(driver);

		WebElement el = driver.findElement(By.id("nav-link-accountList"));

		action.moveToElement(el).perform();

		WebElement divElement = driver.findElement(By.id("nav-flyout-ya-newCust"));

		if (divElement.getText().contains("Start")) {
			System.out.println("Menu is displayed");

		} else {
			System.out.println("Menu is NOT displayed");
		}

		action.contextClick().perform(); //-> how do perform right click?
		
		wait(2);

		/**
		 * It will go to search-box, click on it, write books in the box and then double
		 * click to highlight books.
		 */
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();
		
		wait(2);

		tearDown();
	}

}

// Note1: Action --> is keyboard and mouse related. 
// Note2: For action create object -> Actions action = new Actions(driver);
// Note3: After you move the mouse to the location you want, click to do something. 