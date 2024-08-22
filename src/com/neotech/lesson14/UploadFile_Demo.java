package com.neotech.lesson14;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

// https://the-internet.herokuapp.com/

public class UploadFile_Demo extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		click(driver.findElement(By.xpath("//a[text()='File Upload']")));

		String filePath = System.getProperty("user.dir") + "/screenshots/HRM/homeworkss.png";

		wait(2);

		sendText(driver.findElement(By.xpath("//input[@id='file-upload']")), filePath);

		wait(2);

		click(driver.findElement(By.xpath("//input[@class='button']")));

		tearDown();
	}

}

// Note1: First add the directory and the png file location
// Note2: And then you should choose the element you want to send the text(file path)
// Note3: After uploding, click on the submit button