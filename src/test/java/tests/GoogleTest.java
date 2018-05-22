package tests;

import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.GooglePage;
import utils.GenericUtil;

public class GoogleTest {
	GooglePage google;
	WebDriver driver;
	@BeforeClass
	public void setup(){
		
		driver = GenericUtil.setWebdriver();
		google = new GooglePage();
		google.launchGoogle();
		
	}
	@Test(priority=1)
	public void runTest(){
		System.out.println("Test Runn");
		google.printCustom();
		try{
		google.clickLink();
		}catch (Exception e){
			System.out.println("Exception In Code: " +e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void testTwo(){
		google.printResult();
		//assertEquals(false, true);
	}
	
	@Test
	public void failedCase(){
		System.out.println("Runnnniiinnngggg..........");
		assertEquals(true, false);
		
	}
	
	@AfterClass
	public void tearDown(){
		if (driver!=null){
		driver.close();
		driver.quit();
		}
	}
	
	

}
