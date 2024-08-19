package com.neotech.lesson06;

import com.neotech.utils.BaseClass;
import com.neotech.utils.Configs_Reader;

public class Test2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
	
	/* Preparing for the test */
	setUp();
	
	/* Do the test */
	
	Thread.sleep(5000);
	//Locate some elements
	// findElement(By.id());
	
	/* Clean up everything */
	tearDown();
	
	}
}


// Step1: I am using the setUp method in the BaseClass --> BaseClass.setUp(); or extend the BaseClass to Test2 class

// Step2: 

// Step: I am using the tearDown method to clean up everything from BaseClass --> BaseClass.tearDown(); or extend the BaseClass to Test2 class