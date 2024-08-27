package com.neotech.pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class FileUploadPage extends BaseClass {

	/* Without Page Factory */

	public WebElement fileInput = driver.findElement(By.id("image_file"));

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	/* With Page Factory */

	@FindBy(id = "image_file")
	public WebElement fileInput2;

	@FindBy(xpath = "//span[@id='btnUpload']")
	public WebElement button;

	@FindBy(css = "div.ContactUs")
	public WebElement contactDiv;

	public FileUploadPage() {
		PageFactory.initElements(driver, this);
	}

}

// Note1: For with page factory -->  you will declare driver only once.
// Note2: For without page factory --> you should declare the driver everytime you need WebElement
// Note3: Do NOT forget to make the factory WeElement public