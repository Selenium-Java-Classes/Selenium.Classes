package com.neotech.lesson16;

import com.neotech.pages.DashBoardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

public class DashBoardTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPage login = new LoginPage();

		sendText(login.username, Configs_Reader.getProperty("username"));

		sendText(login.password, Configs_Reader.getProperty("password"));

		click(login.loginButton);

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		DashBoardPage dashboard = new DashBoardPage();

		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test passed.");

		} else {
			System.out.println("Test failed.");
		}

		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();

		if (actualName.equals(expectedName)) {
			System.out.println(expectedName + " is logged in.");
		} else {
			System.out.println(expectedName + " is NOT logged in.");
		}

		wait(2);

		tearDown();
	}

}
