package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtil {
	public static WebDriver driver;
	public void printCustom(){
		System.out.println("Just to check custom");
	}
	
	public static WebDriver setWebdriver(){
		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
