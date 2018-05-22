package tests;

import org.testng.annotations.Test;

import page.GooglePage;

public class GoogleTest {
	@Test
	public void runTest(){
		System.out.println("Test Runn");
		new GooglePage().printCustom();
	}

}
