package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class GenericUtil {
	public static EventFiringWebDriver driver;
	public static WebDriver ndriver;
	public void printCustom(){
		System.out.println("Just to check custom");
	}
	
	public static WebDriver setWebdriver(){
		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		driver = new EventFiringWebDriver(chrome);
		driver.register(new SelenumListner());
		
		return driver;
	}
	
	public static WebDriver setNormalDriver(){
		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
		ndriver = new ChromeDriver();
		return ndriver;
		
	}

}
