package com.neotech.lesson09;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {

		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);

		driver.findElement(By.id("windowButton")).click();

		Set<String> allWindows = driver.getWindowHandles();

		String window2 = null;

		for (String handle : allWindows) {
			if (!handle.equals(window1)) {
				window2 = handle;
				break;
			}
		}

		for (int i = 0; i < 10; i++) {

			driver.switchTo().window(window2);
			System.out.println("Switched to Window 2");

			driver.switchTo().window(window1);
			System.out.println("Switched back to Window 1");
		}

		tearDown();

	}

}
