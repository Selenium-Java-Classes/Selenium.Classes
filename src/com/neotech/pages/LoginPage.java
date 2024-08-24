package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LoginPage extends CommonMethods {

	public WebElement username = driver.findElement(By.id("txtUsername"));

	public WebElement password = driver.findElement(By.id("txtPassword"));

	public WebElement loginButton = driver.findElement(By.xpath("//button"));

}

// You can call them when you want to use these with object -> LoginPage <name> = new LoginPage();