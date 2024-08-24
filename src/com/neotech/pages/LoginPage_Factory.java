package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LoginPage_Factory {
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button")
	public WebElement button;
	
	public LoginPage_Factory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}

// Note1: Since we are reffering the driver once -> no need to extends the CommonMethods
