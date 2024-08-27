package com.neotech.lesson17;

import com.neotech.pages2.FileUploadPage;
import com.neotech.utils.CommonMethods;

//https://neotech.vercel.app/fileUpload

public class PageObjectModel_POM extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		/* Create object for the page class you want to use */
		
		FileUploadPage fileUpload = new FileUploadPage();
		
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Locate the file */
		String filePath = "/Users/sinemtok/Downloads/image (1).png";
		
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Send the path(file) using the object name and the locaters */
		
		fileUpload.fileInput2.sendKeys(filePath);
		
		//Or
		
		sendText(fileUpload.fileInput, filePath);
		
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Click on the upload button */
		click(fileUpload.button);
		
		wait(2);
		
		waitForVisibility(fileUpload.contactDiv);
		
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Verify the text */
		
		String expectedText = "File Upload successfully!";
		String actualText = fileUpload.contactDiv.getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test passed.");
		
		} else {
			System.out.println("Test failed.");
		}

/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		tearDown();
		
	}


}
