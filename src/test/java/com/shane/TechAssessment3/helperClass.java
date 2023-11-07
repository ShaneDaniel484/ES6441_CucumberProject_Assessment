package com.shane.TechAssessment3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
 
 
public class helperClass {
	private static helperClass helperclass;
		private static WebDriver driver;
		private static WebDriverWait wait;
		public static Logger log;
		public final static int TIMEOUT = 10;
		helperClass(){
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
			if(helperclass==null) {
				helperclass = new helperClass();
			}
		}
		public static void tearDown() {
			if(driver!=null) {
				driver.close();
				driver.quit();
			}
			helperclass = null;
		}
	}
