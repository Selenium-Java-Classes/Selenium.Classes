package com.neotech.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class CommonMethods extends BaseClass {

	/**
	 * This method clears a text box and send the text parameter to it
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);

	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method will be lead and follow the spaces
	 * 
	 * This method will also make checkbox or radio button enabled
	 * 
	 * And then clcik on the element that have the attribute value as selectValue
	 * 
	 * @param elementList
	 * @param selectValue
	 */
	public static void clickOn(List<WebElement> elementList, String selectValue) {

		for (WebElement el : elementList) {

			String elementValue = el.getAttribute("value").trim();

			if (elementValue.equals(selectValue) && el.isEnabled()) {
				el.click();
				break;
			}
		}

	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method pauses the execution for a certain amount of seconds.
	 * 
	 * @param seconds
	 */
	public static void wait(int seconds) {

		try {
			Thread.sleep(seconds * 1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method select a drop-down element based on visible text
	 * 
	 * If the there is an issue / throw an exceptin handle it
	 * 
	 * @param element
	 * @param visibleText
	 */

	public static void selectDropdown(WebElement element, String visibleText) {

		try {
			Select sl = new Select(element);
			sl.selectByVisibleText(visibleText);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method select a drop-down element based on index
	 * 
	 * If the there is an issue / throw an exceptin handle it
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, int index) {

		try {
			Select sl = new Select(element);
			sl.selectByIndex(index);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method switches the focus of the driver to an Alert and accept if it
	 * found.
	 * 
	 * If there is alert, it will throw exception so --> tyr-catch.
	 */
	public static void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}
	}

	/**
	 * This method switches the focus of the driver to an Alert and dismiss if it
	 * found.
	 * 
	 * If there is alert, it will throw exception so --> tyr-catch.
	 */
	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will switch the focus of the driver to an alert and return its
	 * text.
	 * 
	 * If alert is not found NoAlertPresentException is handled.
	 * 
	 * @return
	 */
	public static String getAlertText() {

		String alertText = null;

		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText(); // -> We want to return this text, so assign it

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		return alertText;
	}

	/**
	 * This method will switch the focus of the driver to an alert and send text to
	 * it.
	 * 
	 * If alert is not found NoAlertPresentException is handled.
	 * 
	 * @param text
	 */
	public static void sendAletText(String text) {

		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method switches to a frame using name or id.
	 * 
	 * If alert is not found NoSuchFrameException is handled.
	 * 
	 * @param nameOrId
	 */
	public static void swicthToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to a frame using index.
	 * 
	 * @param index
	 */
	public static void swicthToFrame(int index) {

		try {
			driver.switchTo().frame(index);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to a frame using WebElement.
	 * 
	 * @param index
	 */
	public static void swicthToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method creates a wait object based on the driver and explicit wait time.
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Duration.ofSeconds(Constants1.EXPLICIT_WAIT_TIME));
	}

	/**
	 * This method creates a wait object based on the driver and the given amount of
	 * time.
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject(int secondsToWait) {
		return new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
	}

	/**
	 * This method will wait for the element to be visible
	 * 
	 * @param element
	 */
	public static WebElement waitForVisibilty(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait for the element to be clickable
	 * 
	 * @param element
	 */
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait for clickability and then click on the passed element.
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method will switch to focus of the driver to the child window.
	 */
	public static void switchToChildWindow() {

		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			if (!mainWindow.equals(handle)) {

				driver.switchTo().window(handle);
			}
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method taking screenshot of the full page.
	 * 
	 * @param driver
	 * @param screenshotName
	 */
	public static void takeScreenshot(WebDriver driver, String screenshotName) {

		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String fileName = screenshotName + "_" + timeStamp + ".png";

		TakesScreenshot ssDriver = (TakesScreenshot) driver;
		File srcFile = ssDriver.getScreenshotAs(OutputType.FILE);

		try {

			File screenShotsDir = new File("screenshots/HRM");
			if (!screenShotsDir.exists()) {
				screenShotsDir.mkdirs();
			}

			File screenShotLocation = new File(screenShotsDir, fileName);

			Files.copy(srcFile, screenShotLocation);

			System.out.println("Screenshot saved: " + screenShotLocation.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}
	}

	/**
	 * This method will take a screenshot of the specific web-element
	 * 
	 * @param element
	 * @param screenshotName
	 */
	public static void takeElementScreenshot(WebElement element, String screenshotName) {

		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		String fileName = screenshotName + "_" + timeStamp + ".png";

		try {

			File srcFile = element.getScreenshotAs(OutputType.FILE);

			File screenShotsDir = new File("screenshots/HRM");

			if (!screenShotsDir.exists()) {
				screenShotsDir.mkdirs();
			}

			Path screenShotLocation = Paths.get("screenshots/HRM/" + fileName);
			Files.copy(srcFile, screenShotsDir);

			System.out.println("Element screenshot saved: " + screenShotLocation.toString());

		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the element screenshot!");
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/**
	 * This method selects a dropdown option by its index.
	 * 
	 * @param element The dropdown WebElement.
	 * @param index   The index of the option to be selected.
	 */
	public static void selectDropdownByIndex(WebElement element, int index) {
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
	}
}

// Note1: Common Methods --> sendText(), click(), switchToFrame()

// Note2: sendText() --> fir we clear the text if there is one, ad then send the text

// Note3: clickOn() --> We are clicking the "checkboxes" or "radio buttons""
// Note4: The point of it, we are putting web-elements in a list and then loop through
// Note5: trim() --> leading and following spaces. For example if there is a space but you missed, with trim you will fix the problem right away.

// !Note6: You can create the methods to hel you but it does not mean it will work everytime. There might be a different type of attribute if it does not work.

// Note7: seconds * 1000 --> will give the second you want. For example 3000 -> 3*1000

// Note8: When we want to deal with dropdown elements -> locate the elements -> create a select object -> select the value

// Note9: We do not parameter for alerts because we already have actionss

// Note10: Using the screenshot method -> ScreenshotUtil.takeScreenshot(driver, "dashboard");

// Note11: Using the webelement screenshot method -> ScreenshotUtil.takeElementScreenshot(element, "element_screenshot");