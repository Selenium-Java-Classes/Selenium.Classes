package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import com.neotech.utils.BaseClass;

// https://accounts.google.com/signup

public class WindowHandle_Demo extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		System.out.println("Title1 --> " + driver.getTitle());
		
		System.out.println("Window Handle --> " + driver.getWindowHandle());
	
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWindowsHandles = driver.getWindowHandles();
		
		System.out.println("Number of handles --> " + allWindowsHandles);
		
		Iterator <String> it = allWindowsHandles.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("Window 1 --> " + window1);
		System.out.println("Window 2 --> " + window2);
		
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		driver.switchTo().window(window2);
		
		String title2 = driver.getTitle();
		
		System.out.println("\n Title2 -> " + title2);
		
		Thread.sleep(1000);
		
		tearDown();
		
		
	}
}


// Note1: It might look like the driver directly moved to the new tab --> FALSE
// Note2: We need to switch the attention of the driver to the new page using the handle
// Note3: If we want to close the window that driver is focused on --> driver.close() 
// Note4: Put the driver.close() right after the window you are working on


