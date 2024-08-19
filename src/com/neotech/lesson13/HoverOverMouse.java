package com.neotech.lesson13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HoverOverMouse extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		Actions action = new Actions(driver);

		List<WebElement> hoverbutton = driver.findElements(By.xpath("//button[@class='dropbtn']"));

		for (WebElement button : hoverbutton) {

			action.moveToElement(button).perform();
		}

		wait(2);

		tearDown();
	}
}


// Note1: If you want to see it to perform, you can use pause before perform as well.