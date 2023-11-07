package com.shane.TechAssessment3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Register.feature",glue = "com.shane.TechAssessment3",plugin = 
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", monochrome = true, dryRun = false)
public class RegistrationRunner {

}


//
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

//
//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//		"junit:target/cucumber-reports/Cucumber.xml",
//		"html:target/cucumber-reports/cucumber.html"}