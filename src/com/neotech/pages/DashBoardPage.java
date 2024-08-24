package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class DashBoardPage extends CommonMethods {

	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

	public WebElement accountName = driver.findElement(By.id("account-name"));

}

// You can call them when you want to use these with object -> DashBoardPage <name> = new DashBoardPage();