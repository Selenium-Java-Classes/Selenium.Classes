package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

//https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("downloadButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Complete!']"));
		
		tearDown();

	}

}

// Note1: It is always done right after the driver creation (setUp();)
// Note2: driver.manage().timeouts().implicitlyWait(Duration.<of...>)
// Note3: Inside of the code is the maximum time to wait
// Note4: It will wait for all the elements