package com.neotech.lesson14;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

//1) Navigate to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
//2) Upload file
//3) Verify file got successfully uploaded and take screenshot

public class UploadFile extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/HRM/homework_20240818_221412.png";

		wait(2);

		sendText(driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']")), filePath);

		click(driver.findElement(By.xpath("//button[text()='Upload File']")));

		System.out.println("Alert text: " + getAlertText());
		
		acceptAlert();
		
		takeScreenshot(driver, "uploadFile");

		tearDown();
	}

}
