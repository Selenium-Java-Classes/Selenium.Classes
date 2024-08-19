package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// https://neotech.vercel.app/tables

public class Tables extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		/* Find rows */
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

		System.out.println("The number of rows is --> " + rows.size());

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		/* Find columns/cells of the frist row */
		List<WebElement> colOfrow = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		System.out.println("The number of columns is -> " + colOfrow.size());

		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		/* Find all the columns/cells */
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("The number of columns is -> " + columns.size());
		
		
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		
		tearDown();
	}

}

// Note1: For finding the number of the rows --> .findElements() 
// Note2: Since we are getting a number of rows --> List<WebElement>

// Note3: For you to find the specific row -> [<row #>] <- Starts from 1

// Note4: For you to find the all columns --> td 

// Note5: For you to find the specific column -> [<column #>] <- Starts from 1

// Note6: If we want to get all the rows' cells --> //table/tbody/td <-- you do not put any []




