package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
	
	public static final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		/* First Way -> code re-usability */
		
		driver.findElement(By.cssSelector("#RESULT_TextField-1")).sendKeys("Sinem");
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Betul"); //-> What inspect suggest
	
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Max");
	
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		/* Second Way -> code re-usability */
		
		WebElement lastName = driver.findElement(By.id("RESULT_TextField-2"));
		
		lastName.click();
		lastName.clear();
		lastName.sendKeys("Tok");
		
		/* ~~~~~~~~~~~~~~~~~ */
		
		WebElement phone = driver.findElement(By.cssSelector("#RESULT_TextField-3"));
		
		phone.sendKeys("4694909137");
		
		Thread.sleep(1000);
		
		phone.clear();
		
		phone.sendKeys("468729384"); //After clear old input, send new input
		
		String maxLength = phone.getAttribute("maxlength");  //-> How many characters user can send to the element
		
		System.out.println("The max length is --> " + maxLength);
		
		/* ~~~~~~~~~~~~~~~~~ */
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]"));
		
		String countryClass = country.getAttribute("class");
		
		System.out.println("The country name is --> " + countryClass); 
		
		
		/* Get the text value inside a web element */
		
		WebElement title = driver.findElement(By.xpath("//*[@id=\'q19\']/div/h1"));
		
		String titleText = title.getText();
		
		System.out.println("The header text is --> " + titleText);
		
	}

}

// Note1: @ --> attribute

// Note2: XPath starts with double slash "//" 

// Note3: CSS selector starts with hash "#" or dot ".". Since you are looking for css version of the selector, you should start with either id(#) or class(.)

// Note4: * --> check every element not only input or any specific element

/* Note5: For us to get name of a attribute use  --> getAttribute() method --> put the attribute you want to get in the ().
			Example: getAttribute("class"); 	*/

/* Note6: If there is no attribute to use in the element, follow the steps:
 * 			* -> Get the xpath of the element
 * 			* -> Create a String with getText() for finding out the name of the text
 * 			* -> For see the name of it in the console, print it  */









