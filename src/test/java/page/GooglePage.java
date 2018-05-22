package page;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GenericUtil;

public class GooglePage  extends GenericUtil{
	
	WebDriver driver;
	@FindBy(className="Ax4B8 ZAGvjd")
	WebElement searchbar;
	
	@FindBy(xpath="//a[@class='ipQwMb Q7tWef']/span")
	List<WebElement> results;
	
	public GooglePage() {
		driver = super.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLink(){
		searchbar.sendKeys("Brijendra Singh");
		searchbar.sendKeys(Keys.ENTER);
	}
	public void launchGoogle(){
		driver.navigate().to("https://www.news.google.com");
		driver.manage().window().maximize();
	}
	
	public void printResult(){
		int c=0;
		System.out.println("Total result: " + results.size());
		for (WebElement ele: results){
			System.out.println(c+" --> " + ele.getText());
			c++;
		}
	}

}
