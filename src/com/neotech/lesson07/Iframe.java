package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Iframe extends BaseClass{ 
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		/* ~~~~~~~~~~~~~~~~~ Check the title name ~~~~~~~~~~~~~~~~~~ */
		WebElement title = driver.findElement(By.xpath("//div/h3"));
		
		String expectedResult = "An iFrame containing the TinyMCE WYSIWYG Editor";
		
		String actualResult = title.getText();
		
		Thread.sleep(1000);
		
		if(expectedResult.equals(actualResult)) {
			System.out.println("The title test is passed.  --> " + actualResult);
		
		}else {
			System.out.println("The title test is failed.");
		}
		
		/* ~~~~~~~~~ Check the frame and write something in it ~~~~~~~~~ */
		
		/* Step1: Locate the iframe */
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		
		/* Step2: Get into the iframe */
		driver.switchTo().frame(iframe);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("tinymce")).sendKeys("SINEM CILDIRDI!!!!!!!!!");
		
		
		Thread.sleep(1000);
		
		
		/* Step3: Take the driver out from the iframe */
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		tearDown();
		
	}

}



// Note1: For you to take the driver out from the iframe, you can use two methods:
// -> .switchTo().defaultContent();
// -> .switchTo().parentFrame();
