package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//url=https://sis.neotechacademy.com/

public class Beginning {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		String title = driver.getTitle();
		
		System.out.println("Title - " + title);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
