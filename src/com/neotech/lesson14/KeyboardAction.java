package com.neotech.lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

//https://www.amazon.com/

public class KeyboardAction extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		wait(5);

		/* Get the searchbox element */
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		/* Create the Actions object */
		Actions action = new Actions(driver);

		/**
		 * This code will send Apple to searchbox
		 */
		action.click(searchBox).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).sendKeys("pple").perform();

		searchBox.clear(); //-> Clear the searchBox

		/**
		 * This code will send "White board" with upperCase "w" and space between words
		 * after it's done to write the word, it will press the enter
		 */
		action.click(searchBox).keyDown(Keys.SHIFT).sendKeys("W").keyUp(Keys.SHIFT).sendKeys("hite").sendKeys(Keys.SPACE).sendKeys("board").sendKeys(Keys.ENTER).perform();

		wait(2);

		tearDown();

	}

}

// Note1: keyDown(); -> It will press/click the key on keyboard

// Note2: keyUp(); -> It will relase the key on keyboard 

// Note3: Use "Keys" keyword --> for perfom the methods --> keyDown(Keys.<method>) / keyUp(Keys.<method>)

// Note4: Since this is a Action like mouse action -> create object of the Actions

// Note5: You should click on the text box that you want to write something in it. -> action.click()

// Note6: For press the key use the keyDown() method.

// Note7: For specify which key you would like press -> keyDown(Keys.<theKeyWantToPress>)

// Note8: After you press the key you want to take action of it, send key -> keyDown(Keys.<theKeyWantToPress>).sendKeys()

// Note9: After you done sending the value, relase the key -> keyUp(Keys.<theKeyPressed>)

// Note10: For making it work use perfom in the end --> perform();

// Note11: The example code -> action.click(searchBox).keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).perform();

// Note12: If you want to keep pressing and then release use keyDown and Keyup, but otherwise use sendKeys(Key.<theKeyWantToPress>)
