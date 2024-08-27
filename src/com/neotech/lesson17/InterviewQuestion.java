package com.neotech.lesson17;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.pages2.InterviewQuestion_Page;
import com.neotech.utils.CommonMethods;

//Go to https://www.webstaurantstore.com/
//    Search for 'stainless work table'.
//    Go to the next page, until the last one.
//    Add the last of found items to the Cart.
//    Empty the Cart.

public class InterviewQuestion extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		/* Search for 'stainless work table'. */
		InterviewQuestion_Page page = new InterviewQuestion_Page();

		Actions action = new Actions(driver);

		waitForVisibility(page.searchBox);

		action.click(page.searchBox).sendKeys("stainless work table").sendKeys(Keys.ENTER).perform();

		/* Go to the next page, until the last one. */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		List<WebElement> list = page.pageList;
		for (int i = 1; i < list.size() + 1; i++) {
			click(page.nextPage);
		}

		/* Add the last of found items to the Cart. */

		click(page.lastProduct);

		page.addToCart.click();

		click(page.viewCart);

		/* Empty the Cart. */
		waitForClickability(page.delete).click();

		tearDown();
	}

}
