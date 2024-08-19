package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_navigate {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.selenium.dev/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		driver.manage().window().minimize();
		
		Thread.sleep(1000);

		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/quiztest/quiztest.asp?qtest=CSS");
		
		driver.navigate().to("https://github.com/");

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.quit();
	}
}
