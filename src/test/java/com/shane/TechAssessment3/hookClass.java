package com.shane.TechAssessment3;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class hookClass {
	@Before
	public void setup() {
		baseClass.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) baseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		}
		baseClass.tearDown();
	}
}
 
