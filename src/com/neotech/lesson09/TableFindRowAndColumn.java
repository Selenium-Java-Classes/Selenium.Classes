package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

/*QUESTION*/
// -> GET THE DATA FROM THE FRIST ROW

public class TableFindRowAndColumn extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		/* Static way */
		List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		for (WebElement el : firstRowList) {
			System.out.print(el.getText() + " | ");
		}

		Thread.sleep(2000);
		
		System.out.println();
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		/* Dynamic way */
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		for (int i = 1; i <= cols.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + i + "]";

			WebElement el = driver.findElement(By.xpath(path));
			System.out.print(el.getText() + " | ");
		}
		System.out.println();

			

		tearDown();
	}
}
