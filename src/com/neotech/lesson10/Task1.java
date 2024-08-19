package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.Configs_Reader;

/*Question*/
//1) Open chrome browser (done)
//2) Go to https://hrm.neotechacademy.com/ (done)
//3) Login into the application (done)
//4) Select Discipline
//5) Select Disciplinary Cases
//6) Click on Filter (Up-Right next to Help)
//7) Select from June 6, 2024 to July 15, 2024
//8) Click on Search
//9) Validate that there are no rows in result table
//10) Quit the browser

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		/* Login into the application */

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(Configs_Reader.getProperty("username"));

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(Configs_Reader.getProperty("password"));

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		
		/* Select Discipline */

		driver.findElement(By.xpath("//*[@id=\'menu_discipline_defaultDisciplinaryView\']/a")).click();

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Select Disciplinary Cases */

		driver.findElement(By.xpath("//*[@id=\'menu_discipline_viewDisciplinaryCases\']/span[2]")).click();

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Click on Filter (Up-Right next to Help) */

		Thread.sleep(10000);

		driver.switchTo().frame("noncoreIframe");
		WebElement element = driver.findElement(By.xpath("//a[@class='handCurser primary-option tooltipped circle']"));
		element.click();

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Select from June 6, 2024 */

		/* click on the calendar */
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		
		/* click on the month */
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//input[1]")).click();
		// select the month
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//span[text()='July']"))
				.click();

		/* click on the year */
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//div[@class='select-wrapper picker__select--year']/input"))
				.click();
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//div[@class='select-wrapper picker__select--year']//span[text()='2022']"))
				.click();

		/* select the day */
		List<WebElement> days = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']//td"));

		for (WebElement day : days) {
			if (day.getText().equals("5")) {
				day.click();
				break;
			}
		}

		Thread.sleep(5000);

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Select to July 15, 2024 */

		/* click on the next calendar */

		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();

		/* click on the month */
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();

		/* select the month */
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//span[text()='July']"))
				.click();

		/* click on the year */
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//input"))
				.click();

		/* select the year */
		driver.findElement(By.xpath(
				"//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//span[text()='2022']"))
				.click();

		/* select the day */
		List<WebElement> days2 = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']//td"));

		for (WebElement day : days2) {
			if (day.getText().equals("15")) {
				day.click();

				break;
			}
		}

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* click search */
		driver.findElement(By.id("searchBtn")).click();

		Thread.sleep(1000);

		tearDown();
	}

}

// Note1: Steps for getting element from calendar;
// Step1 -> Click on calendar
// Step2 -> Get all td of the table using findElements() method
// Step3 -> Using for loop get the text of each td element
// Step4 -> Using if else condition we will check for the specific date
// Step5 -> If the date is matched then click and break the loop.
