package com.neotech.lesson17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.neotech.utils.CommonMethods;

public class Facebook extends CommonMethods {

	final static String url = "https://www.facebook.com/";

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get(url);

		wait(1);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		wait(1);

		driver.findElement(By.id("email")).sendKeys("yourEMAIL@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("yourPASSWORD");

		driver.findElement(By.name("login")).click();
		wait(1);

		driver.findElement(By.xpath("//span[text()='Neotech Smith']")).click();
		wait(1);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 1; i <= 15; i++) {
			js.executeScript("window.scrollBy(0, 300)");
			wait(1);
		}

		wait(2);

		driver.quit();

	}
}

// Note1: If you want to block notifications whenever you open chrome:
// Step1 ---> Create an object -> ChromeOptions <name> = new ChromeOptions(); 
// Step2 ---> Use method to disabled the notifications -> .addArguments("--disable-notifications")
// Step3 ---> When you creating the browser in the constructor, you have to provide name of the object -> WebDriver driver = new ChromeDriver(<name>);




