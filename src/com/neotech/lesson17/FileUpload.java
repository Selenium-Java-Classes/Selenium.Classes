package com.neotech.lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

//https://neotech.vercel.app/fileUpload

public class FileUpload extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		// String filePath = System.getProperty("user.dir") +
		// "/screenshots/Tasks/uploadFile_20240822_004033.png";

		String filePath = "/Users/sinemtok/Downloads/image (1).png";

		WebElement fileInput = driver.findElement(By.id("image_file"));

		sendText(fileInput, filePath);

		click(driver.findElement(By.xpath("//span[@id='btnUpload']")));

		wait(4);

		WebElement confirm = driver.findElement(By.xpath("//span[@id='upload_response']"));

		if (confirm.isDisplayed()) {
			System.out.println("Test passed.");

		} else {
			System.out.println("Test failed.");
		}

		tearDown();

	}

}
