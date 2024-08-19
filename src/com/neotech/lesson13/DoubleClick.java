package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

//http://webdriveruniversity.com/Actions/index.html

public class DoubleClick extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//div[@id='double-click']"));
		
		action.doubleClick(button).perform();
		
		wait(3);
		
		tearDown();

	}

}
