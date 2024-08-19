package com.neotech.lesson07;

import java.util.Set;
import org.openqa.selenium.By;
import com.neotech.utils.BaseClass;

//https://demoqa.com/browser-windows
	
public class WindowHandle_Example extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		System.out.println("Title --> " + driver.getTitle());
		String mainWindowHandle = driver.getWindowHandle();

		Thread.sleep(2000);

		driver.findElement(By.id("tabButton")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("windowButton")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("messageWindowButton")).click();

		Thread.sleep(2000);

		Set<String> allWindowHandles = driver.getWindowHandles();

		System.out.println("Number of windows: " + allWindowHandles.size());

		Thread.sleep(1000);

		for (String handle : allWindowHandles) {

			if (!handle.equals(mainWindowHandle)) {

				driver.switchTo().window(handle);

				Thread.sleep(3000);

				driver.close();
			}
		}

		tearDown();

	}

}
