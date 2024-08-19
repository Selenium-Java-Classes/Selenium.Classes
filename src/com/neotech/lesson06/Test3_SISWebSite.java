package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.Configs_Reader;

public class Test3_SISWebSite extends BaseClass {

	// Login to SIS Web Application
	// https://sis.neotechacademy.com/
	// username -> Admin
	// password -> Neotech$123

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("tPassword"));
		password.sendKeys("Neotech$123");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		tearDown();
	}

}
