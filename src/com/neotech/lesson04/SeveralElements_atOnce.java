package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeveralElements_atOnce {

	public static final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));

		List<WebElement> elements = driver
				.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));

		/* Click on the female radio button + Check Saturday */

		for (WebElement element : elements) {

			String text = element.getText();

			if (text.equals("Female")) {
				element.click();

			} else if (text.equals("Saturday")) {
				element.click();

			} else {
				System.out.println("I don't want to click on the " + text);
			}

		}

		driver.quit();

	}
}

// Step1: Find something in common  -> //table[@class='inline_grid choices']/tbody/tr/td/label

// Step2: use -->   .findelements() -> !not element it is elements!

// Step3: Check what it returns --> hover over the mouse to the method

// Step4: Create a list for the elements 

// Step5: Loop over each item to find what we want --> Your variable type is !WebElement!

// Step6: Get the text of the element --> .getElement(); --> you are getting it as a String

// Step7: Then check if the text and element is the same --> .equals()

// Step8: After we find the element we are looking for click on it --> .click();
