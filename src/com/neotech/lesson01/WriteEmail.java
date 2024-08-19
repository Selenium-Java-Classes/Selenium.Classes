package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://demoqa.com/automation-practice-form
	
public class WriteEmail {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.neotechacademy.com/");
		
		driver.manage().window().maximize();

		WebElement emailElement = driver.findElement(By.id("Email-2"));

		emailElement.click();

		emailElement.sendKeys("toksinem.9@gmail.com");
		
		Thread.sleep(7000);
		
		driver.quit();

	}
}
