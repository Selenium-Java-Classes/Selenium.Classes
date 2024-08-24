package com.neotech.lesson16;

import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.Configs_Reader;

//https://hrm.neotechacademy.com/auth/login

public class LogInTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPage login = new LoginPage();

		sendText(login.username, Configs_Reader.getProperty("username"));

		sendText(login.password, Configs_Reader.getProperty("password"));

		click(login.loginButton);

		tearDown();
	}

}
