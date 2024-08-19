package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

//	Open chrome browser
//	Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	Enter valid username and password
//	Click on login button
//	Then verify "Web Orders" is displayed and also username is displayed right top corner
	
	
	public static final String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		
		/* Let's check the header */		
		
		WebElement header = driver.findElement(By.tagName("h1"));
		
		if(header.isDisplayed()) {
			System.out.println("The header " + header.getText() + " is displayed. ");
		
		}else {
			System.out.println("Header is not displayed!!!");
		}
		
		
		/* Let's check the username */	
		
		WebElement username = driver.findElement(By.cssSelector("div.login_info")); 
		
		System.out.println(username.getText());
		
		if(username.getText().contains("Tester")) {
			System.out.println("Tester log in successfully.");
		
		}else {
			System.out.println("Log-in failed.");
		}
		
		driver.quit();
	}
}


// Step1: Check if the header's name displayed or not --> .isDisplayed() <-- return boolean

// Step2: If the header is displayed, give me name of the header --> .getText()

// Step3: For checking the username, it is under the div --> get either css or xpath

// Step4: Get the name inside the text --> check if the putcome is match or not

// Step5: Give the result in the console
