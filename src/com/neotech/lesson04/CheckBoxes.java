package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	
	public static final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		/* Radio Button */
		
		WebElement maleRb = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		
		maleRb.click();
		
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']")).click();
		
		/* Check-box Button */
		
		WebElement monday = driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']"));
		
		monday.click();
		
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_3']")).click();
		
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_4']")).click();	
	}

}


// Note1: You can select only one radio button but you can select multiple check box

// Note2: 