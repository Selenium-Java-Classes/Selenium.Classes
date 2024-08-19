package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_Xpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchBox.sendKeys("Game Keyboards");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id=\'nav-search-submit-button\']"));
		
		searchButton.click();
		
		driver.quit();
	}

}


// Note1: Web element can be an element in the website you see

/* Note2: Web element locators
* -> name
* -> id
* -> className
* -> linkText
* -> tagName
* -> xpath  
* -> cssSelector */

// Note3: relative xpath --> //*[@id="twotabsearchtextbox"] 
// Note4: full Xpath --> /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input

// Note5: "*" -> means contains and in the xpath means "input" -> it will give unique element

/* Note6: If you get the element from <span> and jump to the child element;
			-> #class / input --> #nav-search-submit-text / input */









