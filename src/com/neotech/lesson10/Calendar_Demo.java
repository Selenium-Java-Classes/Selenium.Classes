package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Calendar_Demo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		/* click */

		driver.findElement(By.xpath("//span[@class='calDepartLabelCont']/span[2]")).click();

		/* click on the December - depart */

		String currentM = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		while (!currentM.equals("December")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			currentM = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		}

		/* Click on the 20 */

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));

		for (WebElement day : days) {
			String dayNum = day.getText();

			if (dayNum.equals("20")) {
				day.click();

				break;

			}
		}

		/* click on the January - return */

		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		while (!returnMonth.equals("January")) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();

			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}

		/* Click on the 20 */

		Thread.sleep(5000);

		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		for (WebElement day : returnDays) {
			String dayNum = day.getText();

			if (dayNum.equals("27")) {
				day.click();
				break;
			}
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@value='done']")).click();

		Thread.sleep(5000);

		tearDown();
	}

}
