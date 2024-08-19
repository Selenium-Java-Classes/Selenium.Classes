package com.neotech.lesson13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

//Go to this link: https://jqueryui.com/
//Click on Datepicker from the left menu (done)
//Show the Calendar (done)
//Select 09/25/2026 from the Calendar (done)
//Verify that you have selected 09/25/2026

public class Calendar extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		click(driver.findElement(By.xpath("//a[text()='Datepicker']")));

		wait(2);
		
		swicthToFrame(0);

		click(driver.findElement(By.xpath("//input[@class='hasDatepicker']")));

		String monthAndYear = "September 2026";

		while (true) {

			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String text = monthYear.getText();

			if (text.equals(monthAndYear)) {
				break;
			}

			click(driver.findElement(By.xpath("//span[text()='Next']")));
		}
		
		wait(2);
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement day : days) {
			String dayNum = day.getText();

			if (dayNum.equals("25")) {
				day.click();

				break;

			}
		}
	
		wait(2);

		
		tearDown();

	}

}
