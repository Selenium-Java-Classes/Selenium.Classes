package com.neotech.lesson03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver selenium = new ChromeDriver();
		
		selenium.navigate().to("https://www.selenium.dev/");
		
		selenium.navigate().to("https://www.google.com/");
		
		 for (int i = 0; i < 10; i++) {
			 
			 Thread.sleep(1000);
			 
			 selenium.navigate().back();
			 Thread.sleep(1000);
			 
			 selenium.navigate().forward();
			 Thread.sleep(1000);
			 
		 }
		 selenium.quit();
	}
	

}
