package com.neotech.lesson16;

import com.neotech.pages.Dashboard_Factory;
import com.neotech.pages.LoginPage_Factory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

//https://hrm.neotechacademy.com/auth/login

public class FactoryPage_Test extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPage_Factory login = new LoginPage_Factory();

		Dashboard_Factory dashboard = new Dashboard_Factory();

		sendText(login.username, Configs_Reader.getProperty("username"));

		sendText(login.password, Configs_Reader.getProperty("password"));

		click(login.button);

		wait(2);

		/* Validate if the logo displayed */
		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test passed.");

		} else {
			System.out.println("Test failed.");
		}

		/* Validate the account name */
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();
		
		if(actualName.equals(expectedName)) {
			System.out.println("Test passed -> " + dashboard.accountName.getText() );
		} else {
			System.out.println("Test failed.");
		}
		
		wait(2);
		
		tearDown();

	}
}
