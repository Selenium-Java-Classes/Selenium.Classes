package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

														/*QUESTION*/
												// Go to https://amazon.com
												// select Books from the search drop-down
												// Type Harry potter
												// And click on Search
												// Check "Kindle Unlimited Eligible" checkbox on the left

public class HarryPotter_Search extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();


		WebElement selectDDElement = driver.findElement(By.id("searchDropdownBox"));
		
		Select selectDD = new Select(selectDDElement);

		selectDD.selectByVisibleText("Books");

		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));

		searchTxt.sendKeys("Sinem");
	
		searchTxt.clear();
	
		searchTxt.sendKeys("Harry Potter");

		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();

		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
		
		System.out.println("There are -> " + elementList.size() + " <- elements with that xPath");


		for (WebElement element : elementList) {
			String elementText = element.getText();

			if (elementText.equals("Kindle Unlimited Eligible")) {
				element.click();
				break;
			}
		}

		Thread.sleep(1000);

		tearDown();
	}

	}

// Note1: Select is a class of Selenium --> We use convert the WebElement box

// Note2.1: First way to select one drop-down option -> <SelectClassName>.selectByIndex();
// Note2.2: Second way to select one drop-down option -> <SelectClassName>.selectByValue();
// Note2.3: Third way to select one drop-down option -> <SelectClassName>.selectByVisibleText();

// Note3: StaleElementReferenceException --> happens when you click and don't break the loop
