package com.shane.TechAssessment3;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
 
public class baseClass {
	private static baseClass democartbaseclass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
	public static org.apache.logging.log4j.Logger log;
	
	baseClass(){
		driver = new EdgeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(democartbaseclass==null) {
			democartbaseclass = new baseClass();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		
		democartbaseclass = null;
	}
 
}

