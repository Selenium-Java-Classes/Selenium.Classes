package com.neotech.lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.neotech.utils.BaseClass;

//https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html

public class FluentWait extends BaseClass {

	public static void main(String[] args) {

		setUp();

		driver.findElement(By.id("downloadButton")).click();

		tearDown();
	}

}
