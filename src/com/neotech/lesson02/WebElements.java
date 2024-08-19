package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	//TASK
	
	//1. Open chrome browser
	//2. Navigate to “https://www.facebook.com/”
	//3. Fill out the username & password

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");;
		
		WebElement usernameBox = driver.findElement(By.id("email")); 
		
		usernameBox.sendKeys("toksinem.9@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Sinem0814");
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}

}


// Note1: For making the system do something you need -> unique elements

/* Note2: There are 8 locators to find elements (inspect)
 * ID
 * Name
 * className
 * LinkText --> outside of the ancher of div elements'
 * XPath
 * CSS Selector
 * tagName
 * partialLinkText --> You do not need to write all the linktext
 * */


// Note3: When you are finding the element you can use -> WebElement -> to declare find element method

// Note4: For you to do something, you should find the element by the locator first -> findElement(By.<locator>(" "); 

// Note5: After you find the element, you will send keys to the website -> sendKeys();

// Note6: You can also write the method together without declare it --> findElement(By.id("")).sendKeys("");

// Note7: If you want to click on the button -> find the element first -> use click() method after

// Note8: You cannot use id because id is generated/dynamic, it will change

