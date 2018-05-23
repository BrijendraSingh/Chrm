package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.DynamicWaitMethodes;
import utils.GenericUtil;

public class DynamicWaitTest {
	WebDriver driver;
	DynamicWaitMethodes page;
	
	@BeforeClass
	public void setUpBrowser(){
		driver = GenericUtil.setNormalDriver();
		driver.get(System.getProperty("user.dir")+"/resources/dynamicwait.html");
		page = new DynamicWaitMethodes();
	}
	
	@Test
	public void testWebdriverWait(){
		//By by =By.id("target");
		By by = By.xpath("//p[@id='dynamicText']/a[text()='dynamicText0']");
		page.findEllementByText(by, "dynamicText6");
		//page.findEllementByText(by, "dynamicText1");
		//page.findEllementByText(by, "dynamicText6");
		
	}
	
	@Test
	public void testDynamicColour() throws InterruptedException{
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@id='dynamicColor'][@style='color: yellow;']"));
		page.clickYelloButton(ele);
	}
	
	@Test
	public void testDynamicColour1(){
		By by = By.xpath("//button[@id='dynamicColor'][@style='color: yellow;']");
		page.clickYelloButtonBy(by);
	}
	
	@Test
	public void clickDynamicLync6(){
		By by = By.xpath("//p[@id='dynamicText']/a[text()='dynamicText0']");
		page.clickOnDynamicText6Link(by);
	}
	
	@Test
	public void clickDynamicLink6FluentWait(){
		//By by = By.xpath("//p[@id='dynamicText']/a[text()='dynamicText0']");
		page.clickLink_FluentWait("//p[@id='dynamicText']/a[text()='dynamicText0']");
	}
	
	@AfterClass
	public void tearDown(){
		if(driver!=null){
			driver.close();
		}
	}
}
