package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {
	
	//Go to the URL --> https://demoqa.com/nestedframes/#google_vignette
	
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		/*Switch using ID*/
		driver.switchTo().frame("frame1"); //-> Moved to the parent frame
		
		Thread.sleep(1000);
		
		
		/*Switch using WebElement*/
		
		WebElement childFrame = driver.findElement(By.xpath("/iframe[@srdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(childFrame);
		
		WebElement p = driver.findElement(By.xpath("//body/p"));
		
		String text = p.getText();
		
		System.out.println("The text inside the child fram is -> " + text);
		
		/* Go back to the deafult */
		driver.switchTo().defaultContent();
		
		
	}

}


// Note1: Main Content --> Parent Frame --> Child Frame
// Note2: For us to go to the child frame, you have to go with order
// Note3: If you want to go back, you can go back wherever you want directly