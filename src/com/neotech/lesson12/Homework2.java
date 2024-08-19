package com.neotech.lesson12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

//Go to https://hrm.neotechacademy.com/ (done)
//Log in using our custom methods (done) 
//Go to PIM menu (done)
//Add an employee (done)
//Go to Employee List (done)
//Get the list of the employees (Using tables - tr and td) 
//Loop to search for the employee you added
//When you find the employee - click on it.
//Take a screenshot

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Log in */
		sendText(driver.findElement(By.id("txtUsername")), Configs_Reader.getProperty("username"));
		
		sendText(driver.findElement(By.id("txtPassword")), Configs_Reader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		/* Go to PIM menu and Add an employee */
		waitForVisibilty(driver.findElement(By.className("page-title")));
		
		click(driver.findElement(By.xpath("//span[text()='PIM']")));
		
		click(driver.findElement(By.xpath("//span[text()='Add Employee']")));

		/* Fill in employee details */
		waitForVisibilty(driver.findElement(By.className("page-title")));
		
		sendText(driver.findElement(By.id("first-name-box")), Configs_Reader.getProperty("firstName"));
		
		sendText(driver.findElement(By.id("last-name-box")), Configs_Reader.getProperty("lastName"));
		
		selectDropdown(driver.findElement(By.id("location")), 5);

		wait(1);
		click(driver.findElement(By.id("modal-save-button")));
		wait(2);

		/* Go to Employee List and select the employee */
		waitForVisibilty(driver.findElement(By.xpath("//h4[text()='Personal Details']")));
		
		click(driver.findElement(By.xpath("//span[text()='Employee List']")));
		
		wait(5);

		/* Loop to search for the employee you added */
		List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		String employeeName = Configs_Reader.getProperty("firstName") + " " + Configs_Reader.getProperty("lastName");

		for (WebElement cell : cells) {
		   
		    String cellText = cell.getText();
		    
		    if (cellText.equals(employeeName)) {
		        cell.click();
		        break;
		    }
		}
		
		wait(4);
		
		// Save employee details and take a screenshot
		//waitForClickability(driver.findElement(By.xpath("//button[text()='Save']")));
		//click(driver.findElement(By.xpath("//button[text()='Save']")));

		//wait(4);
		
		
		takeScreenshot(driver, "homework");

		tearDown();
	}

}