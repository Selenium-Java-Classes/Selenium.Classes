package com.neotech.lesson09;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

//https://neotech.vercel.app/windows

public class HandlingWindow extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);

		driver.findElement(By.id("tabButton")).click();

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();
		
		for(String windowID : allWindows) {
			System.out.println(windowID);
			
			if(!windowID.equals(window1)) {
				driver.switchTo().window(windowID);
			}
		}

		driver.findElement(By.name("q")).sendKeys("Sinem is the BESTTT!!");
		tearDown();
	}

}

// Note1: Windows are ID and IDs are unique. So, everytime you will get different ID.

// Note2: Even though you open the new tab, if you do not change the tab, the system will not find the element from new tab

// Note3: You should switch to page for getting the element from the page you want.
