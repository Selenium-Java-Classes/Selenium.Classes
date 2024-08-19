package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

//url = https://www.facebook.com/r.php

public class FacebookSignUp extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		selectDropdown(driver.findElement(By.id("day")), 24); //-> With index, so for 25 you should do 25-1 = 24
		
		wait(2);
		
		selectDropdown(driver.findElement(By.id("month")), "Apr"); //-> With visibleText
		
		wait(2);
		
		selectDropdown(driver.findElement(By.id("year")), "2001"); //-> With visibleText
		
		wait(3);
		
		tearDown();
	}

}
