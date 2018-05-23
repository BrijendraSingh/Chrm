package page;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.GenericUtil;

public class DynamicWaitMethodes extends GenericUtil {
	WebDriver driver;
	
	public DynamicWaitMethodes() {
		driver = GenericUtil.ndriver;
	}
	
	public void findEllementByText(By by,String text){
		if((new WebDriverWait(driver, 20)).until(ExpectedConditions.textToBePresentInElement(by, text))){
			System.out.println("Text found: in Element: " + text);
			assertTrue(true, "Text found: in Element: " + text);
		}else{
			System.out.println("Text NOT found: in Element: " + text);
			assertTrue(false, "Text NOT found: in Element: " + text);
		}
	}
	
	public void clickOnDynamicText6Link(By by){
		WebElement ele =(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
		ele.click();
		System.out.println("Elelemt clicked: " + ele.getText());
	}
	
	
	public void clickYelloButton(WebElement element){
		WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
		ele.click();
	}
	
	public void clickYelloButtonBy(By by){
		WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
		ele.click();
		System.out.println("Element Clicked: " + ele.getText());
	}
	
	public void clickLink_FluentWait(final String xpath){
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(20, TimeUnit.SECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(StaleElementReferenceException.class)
			.ignoring(NoSuchElementException.class);
	WebElement ele =wait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			System.out.println("INSIDE FLUENT WAIT ----------------->");
			return driver.findElement(By.xpath(xpath));
		}
	
	});
	System.out.println("CLICKED ***************************");
	ele.click();
				
		
	}

}
