package com.shane.TechAssessment3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@invalid_Credentials", features = "src\\test\\resources\\Login.feature",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class loginRunner {

}


//
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

//
//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//		"junit:target/cucumber-reports/Cucumber.xml",
//		"html:target/cucumber-reports/cucumber.html"}