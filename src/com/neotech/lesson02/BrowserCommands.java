package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

					//TASK
	
//1. Open chrome browser
//2. Navigate to “https://www.zillow.com/”
//3. Navigate to “https://www.google.com/”
//4. Navigate back to Zillow Page
//5. Refresh current page
//6. Verify url contains “Zillow”
	
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  //-> Open web driver
		
		driver.navigate().to("https://www.zillow.com/"); //Navigate/go to the URL
		
		Thread.sleep(2000); //-> Waiting time to us see the screen
		
		driver.manage().window().maximize(); //-> Maximizing the window
		driver.manage().window().fullscreen(); //-> Maximizing the window
		
		
		driver.navigate().to("https://www.google.com/"); //-> Go to another URL
		
		driver.navigate().back(); //-> Come back to this URL
		
		driver.navigate().refresh(); //-> Make sure the recent page is loaded
		
		String url = "https://www.zillow.com/"; //-> The page that I want to see in the end
		String currentUrl = driver.getCurrentUrl(); //-> The current URL the website in
		
		/* Check if the current url is equal to url I want to be in */
		if(url.equals(currentUrl)) { 	
			System.out.println("Test Passed");
		
		}else {
			System.out.println("Test Failed");
			System.out.println("Current URL -->" + currentUrl);
			System.out.println("Expected URL --> " + url);
		}
		
		driver.quit();
	}
	
}





// Note1: We can use navigate().to(String url); instead of get(URL); method.

// Note2: With navigate we can get something more, for example we can keep going even the url change.

// Note3: navigate().to(String url); --> we can navigate forward and back.

// Note4: get(URL); --> does not maintain the browsing history -> It will only work on the page that we provide URL, nothing more

/* Note5: If you want to maximize your window, use either --> manage().window().maximize(); 
											  			  --> manage().window().fullscreen(); */

// Note6: If you would like to go to new page --> navigate().to(URL); -> put the URL you want to go

// Note7: If you want to come back to the previus page --> navigate().back();

// Note8: If you need to ensure that the most recent version of the page is loaded -> navigate().refresh(); <-- Not mandatory

// Note9: For get the URL your webdriver in that moment/currently --> getCurrentUrl();





